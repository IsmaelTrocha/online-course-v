package com.onlinecourse.course.infrastructure.api.mapper.request;

import com.onlinecourse.course.domain.entities.Video;
import com.onlinecourse.course.infrastructure.api.dto.request.VideoRequest;
import com.onlinecourse.course.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface VideoRequestMapper extends EntityToDto<Video, VideoRequest> {

  @Mapping(source = "courseContentId",target = "courseContent.id")
  Video toEntity(VideoRequest videoRequest);

}
