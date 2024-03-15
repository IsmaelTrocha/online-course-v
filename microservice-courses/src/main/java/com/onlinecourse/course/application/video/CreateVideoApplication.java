package com.onlinecourse.course.application.video;

import com.onlinecourse.course.domain.entities.Video;
import com.onlinecourse.course.domain.services.video.CreateVideoService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateVideoApplication {

  private final CreateVideoService createVideoService;

  public Video createVideo(Video video) {
    return createVideoService.createVideo(video);
  }

}
