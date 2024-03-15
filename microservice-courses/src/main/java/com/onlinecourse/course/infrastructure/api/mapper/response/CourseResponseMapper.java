package com.onlinecourse.course.infrastructure.api.mapper.response;

import com.onlinecourse.course.domain.entities.Course;
import com.onlinecourse.course.infrastructure.api.dto.response.CourseResponse;
import com.onlinecourse.course.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CourseResponseMapper extends EntityToDto<Course, CourseResponse> {

}
