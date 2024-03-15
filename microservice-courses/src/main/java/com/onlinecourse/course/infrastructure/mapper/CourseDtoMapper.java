package com.onlinecourse.course.infrastructure.mapper;

import com.onlinecourse.course.domain.entities.Course;
import com.onlinecourse.course.infrastructure.jpa.repository.course.CourseDto;
import com.onlinecourse.course.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CourseContentDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CourseDtoMapper extends EntityToDto<Course, CourseDto> {

}
