package com.onlinecourse.course.domain.services.video;

import com.onlinecourse.course.domain.entities.Video;

public interface FindVideoByIdService {

  Video getVideoById(Long id);
}
