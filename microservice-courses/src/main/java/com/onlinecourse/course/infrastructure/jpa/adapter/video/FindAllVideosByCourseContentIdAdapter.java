package com.onlinecourse.course.infrastructure.jpa.adapter.video;

import com.onlinecourse.course.domain.entities.Video;
import com.onlinecourse.course.domain.services.video.FindAllVideosByCourseContentIdService;
import com.onlinecourse.course.infrastructure.jpa.repository.video.VideoRepository;
import com.onlinecourse.course.infrastructure.mapper.VideoDtoMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FindAllVideosByCourseContentIdAdapter implements
    FindAllVideosByCourseContentIdService {

  private final VideoRepository videoRepository;
  private final VideoDtoMapper videoDtoMapper;

  @Override
  public List<Video> findAllVideosByCourseContentId(Long id) {
    return videoRepository.findAllByCourseContentId(id).stream().map(videoDtoMapper::toEntity)
        .toList();
  }

}
