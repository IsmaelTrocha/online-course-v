package com.onlinecourse.course.infrastructure.jpa.adapter.coursecontent;

import com.onlinecourse.course.domain.entities.CourseContent;
import com.onlinecourse.course.domain.services.coursecontent.FindCourseContentByCourseIdService;
import com.onlinecourse.course.infrastructure.jpa.repository.coursecontent.CourseContentRepository;
import com.onlinecourse.course.infrastructure.mapper.CourseContentDtoMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FindCourseContentByCourseIdAdapter implements FindCourseContentByCourseIdService {

  private final CourseContentRepository courseContentRepository;
  private final CourseContentDtoMapper courseContentDtoMapper;

  @Override
  public List<CourseContent> findCourseContentByCourseIds(Long courseId) {
    return courseContentDtoMapper.toEntity(
        courseContentRepository.findAllByCourseId(
            courseId));
  }
}
