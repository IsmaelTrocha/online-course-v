package com.onlinecourse.course.application.video;

import com.onlinecourse.course.domain.entities.Video;
import com.onlinecourse.course.domain.services.video.FindAllVideosByCourseContentIdService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindAllVideosByCourseContentIdApplication {

  private final FindAllVideosByCourseContentIdService findAllVideosByCourseContentIdService;

  public List<Video> findAllVideosByCourseContentId(Long id) {
    return findAllVideosByCourseContentIdService.findAllVideosByCourseContentId(id);
  }

}
