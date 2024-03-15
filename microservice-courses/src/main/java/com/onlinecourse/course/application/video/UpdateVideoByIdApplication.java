package com.onlinecourse.course.application.video;

import com.onlinecourse.course.domain.services.video.UpdateVideoService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateVideoByIdApplication {

  private final UpdateVideoService updateVideoService;

  public void updateVideoById(Long id, String title) {
    updateVideoService.updateVideo(id, title);
  }
}
