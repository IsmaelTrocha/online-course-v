package com.onlinecourse.course.domain.services.video;

import com.onlinecourse.course.domain.entities.Video;

public interface UpdateVideoService {

  Video updateVideo(Long id, String title);

}
