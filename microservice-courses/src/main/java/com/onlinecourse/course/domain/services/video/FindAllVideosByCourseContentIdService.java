package com.onlinecourse.course.domain.services.video;

import com.onlinecourse.course.domain.entities.Video;
import java.util.List;

public interface FindAllVideosByCourseContentIdService {

  List<Video> findAllVideosByCourseContentId(Long id);

}
