package com.onlinecourse.course.application.video;

import com.onlinecourse.course.domain.entities.Video;
import com.onlinecourse.course.domain.services.video.FindVideoByIdService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindVideoByIdApplication {

  private final FindVideoByIdService findVideoByIdService;

  public Video findVideoById(Long id) {
    return findVideoByIdService.getVideoById(id);
  }

}
