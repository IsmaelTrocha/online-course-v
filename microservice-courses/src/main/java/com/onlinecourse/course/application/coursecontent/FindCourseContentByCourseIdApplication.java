package com.onlinecourse.course.application.coursecontent;

import com.onlinecourse.course.domain.entities.CourseContent;
import com.onlinecourse.course.domain.services.coursecontent.FindCourseContentByCourseIdService;
import com.onlinecourse.course.domain.services.video.FindAllVideosByCourseContentIdService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindCourseContentByCourseIdApplication {

  private final FindCourseContentByCourseIdService findCourseContentByCourseIdService;
  private final FindAllVideosByCourseContentIdService findAllVideosByCourseContentIdService;

  public List<CourseContent> findCourseContentsByCourseId(Long courseId) {

    List<CourseContent> findCourseContentsByCourseId = findCourseContentByCourseIdService.findCourseContentByCourseIds(
        courseId);
    findCourseContentsByCourseId.forEach(courseContent -> {
      courseContent.setVideos(
          findAllVideosByCourseContentIdService.findAllVideosByCourseContentId(
              courseContent.getId()));
    });
    return findCourseContentsByCourseId;

  }

}
