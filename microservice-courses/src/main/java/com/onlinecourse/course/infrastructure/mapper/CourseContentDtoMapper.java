package com.onlinecourse.course.infrastructure.mapper;

import com.onlinecourse.course.domain.entities.CourseContent;
import com.onlinecourse.course.infrastructure.jpa.repository.coursecontent.CourseContentDto;
import com.onlinecourse.course.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    VideoDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CourseContentDtoMapper extends EntityToDto<CourseContent, CourseContentDto> {

}
