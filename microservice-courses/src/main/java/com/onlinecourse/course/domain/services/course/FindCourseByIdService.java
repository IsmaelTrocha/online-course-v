package com.onlinecourse.course.domain.services.course;

import com.onlinecourse.course.domain.entities.Course;

public interface FindCourseByIdService {

  Course findById(Long id);

}
