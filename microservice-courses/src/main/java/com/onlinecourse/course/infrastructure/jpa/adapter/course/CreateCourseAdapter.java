package com.onlinecourse.course.infrastructure.jpa.adapter.course;

import com.onlinecourse.course.domain.entities.Course;
import com.onlinecourse.course.domain.services.course.CreateCourseService;
import com.onlinecourse.course.infrastructure.jpa.repository.course.CourseRepository;
import com.onlinecourse.course.infrastructure.mapper.CourseDtoMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateCourseAdapter implements CreateCourseService {

  private final CourseRepository courseRepository;
  private final CourseDtoMapper courseDtoMapper;

  @Override
  public Course createCourse(Course course) {
    return courseDtoMapper.toEntity(courseRepository.save(courseDtoMapper.toDto(course)));
  }
}
