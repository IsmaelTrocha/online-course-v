package com.onlinecourse.course.infrastructure.jpa.adapter.course;

import com.onlinecourse.course.domain.entities.Course;
import com.onlinecourse.course.domain.services.course.FindCourseByIdService;
import com.onlinecourse.course.infrastructure.jpa.repository.course.CourseRepository;
import com.onlinecourse.course.infrastructure.mapper.CourseDtoMapper;
import com.onlinecourse.course.shared.exception.code.ExceptionCode;
import com.onlinecourse.course.shared.exception.message.exception.CourseNotFoundException;
import com.onlinecourse.course.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FindCourseByIdAdapter implements FindCourseByIdService {

  private final CourseRepository courseRepository;
  private final CourseDtoMapper courseDtoMapper;
  private final MessageUtils messageUtils;

  @Override
  public Course findById(Long id) {
    return courseDtoMapper.toEntity(courseRepository.findById(id)
        .orElseThrow(() -> new CourseNotFoundException(messageUtils.getMessage(
            ExceptionCode.COURSE_NOT_FOUND_EXCEPTION.getType(), id.toString()))));
  }
}
