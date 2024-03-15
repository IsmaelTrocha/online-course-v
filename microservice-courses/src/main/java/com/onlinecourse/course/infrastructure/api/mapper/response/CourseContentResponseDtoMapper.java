package com.onlinecourse.course.infrastructure.api.mapper.response;

import com.onlinecourse.course.domain.entities.CourseContent;
import com.onlinecourse.course.infrastructure.api.dto.response.CourseContentResponse;
import com.onlinecourse.course.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CourseContentResponseDtoMapper extends
    EntityToDto<CourseContent, CourseContentResponse> {

}
