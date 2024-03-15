package com.onlinecourse.course.application.course;

import com.onlinecourse.course.application.coursecontent.FindCourseContentByCourseIdApplication;
import com.onlinecourse.course.domain.entities.Course;
import com.onlinecourse.course.domain.entities.CourseContent;
import com.onlinecourse.course.domain.services.course.FindCourseByIdService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindCourseByIdApplication {

  private final FindCourseByIdService findCourseByIdService;
  private final FindCourseContentByCourseIdApplication findCourseContentByCourseIdApplication;

  public Course findCourseById(Long id) {
    List<CourseContent> courseContent = findCourseContentByCourseIdApplication
        .findCourseContentsByCourseId(id);
    Course course = findCourseByIdService.findById(id);
    course.setCourseContents(courseContent);
    return course;
  }
}
