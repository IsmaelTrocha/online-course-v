package com.onlinecourse.course.application.course;

import com.onlinecourse.course.domain.entities.Course;
import com.onlinecourse.course.domain.services.course.FindCourseByIdService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindCourseByIdApplication {

  private final FindCourseByIdService findCourseByIdService;

  public Course findCourseById(Long id) {
    return findCourseByIdService.findById(id);
  }
}
