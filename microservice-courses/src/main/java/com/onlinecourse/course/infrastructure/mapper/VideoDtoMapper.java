package com.onlinecourse.course.infrastructure.mapper;

import com.onlinecourse.course.domain.entities.Video;
import com.onlinecourse.course.infrastructure.jpa.repository.video.VideoDto;
import com.onlinecourse.course.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface VideoDtoMapper extends EntityToDto<Video, VideoDto> {

}
