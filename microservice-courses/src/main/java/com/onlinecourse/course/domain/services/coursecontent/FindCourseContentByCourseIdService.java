package com.onlinecourse.course.domain.services.coursecontent;

import com.onlinecourse.course.domain.entities.CourseContent;
import java.util.List;

public interface FindCourseContentByCourseIdService {

  List<CourseContent> findCourseContentByCourseIds(Long courseId);

}
