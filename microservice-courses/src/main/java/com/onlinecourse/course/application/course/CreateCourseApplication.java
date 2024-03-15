package com.onlinecourse.course.application.course;

import com.onlinecourse.course.domain.entities.Course;
import com.onlinecourse.course.domain.services.course.CreateCourseService;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateCourseApplication {

  private final CreateCourseService createCourseService;

  public Course createCourse(Course course, String createdBy) {
    course.setCreationDate(LocalDateTime.now());
    course.setCreatedBy(createdBy);
    return createCourseService.createCourse(course);
  }
}
