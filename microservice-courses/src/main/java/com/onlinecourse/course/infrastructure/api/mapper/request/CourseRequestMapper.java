package com.onlinecourse.course.infrastructure.api.mapper.request;

import com.onlinecourse.course.domain.entities.Course;
import com.onlinecourse.course.infrastructure.api.dto.request.CourseRequest;
import com.onlinecourse.course.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CourseRequestMapper extends EntityToDto<Course, CourseRequest> {

}
