package com.onlinecourse.course.application;

import com.onlinecourse.course.application.course.CreateCourseApplication;
import com.onlinecourse.course.application.course.FindCourseByIdApplication;
import com.onlinecourse.course.application.coursecontent.FindCourseContentByCourseIdApplication;
import com.onlinecourse.course.application.video.FindAllVideosByCourseContentIdApplication;
import com.onlinecourse.course.domain.services.course.CreateCourseService;
import com.onlinecourse.course.domain.services.course.FindCourseByIdService;
import com.onlinecourse.course.domain.services.coursecontent.FindCourseContentByCourseIdService;
import com.onlinecourse.course.domain.services.video.FindAllVideosByCourseContentIdService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {


  @Bean
  public CreateCourseApplication createCourseApplication(
      CreateCourseService createCourseService) {
    return new CreateCourseApplication(createCourseService);
  }

  @Bean
  public FindCourseByIdApplication findCourseByIdApplication(
      FindCourseByIdService findCourseByIdService) {
    return new FindCourseByIdApplication(findCourseByIdService);
  }

  @Bean
  public FindCourseContentByCourseIdApplication findCourseContentByCourseIdApplication(
      FindCourseContentByCourseIdService findCourseContentByCourseIdService,
      FindAllVideosByCourseContentIdService findAllVideosByCourseContentIdService) {
    return new FindCourseContentByCourseIdApplication(findCourseContentByCourseIdService,
        findAllVideosByCourseContentIdService);
  }

  @Bean
  public FindAllVideosByCourseContentIdApplication findAllVideosByCourseContentIdApplication(
      FindAllVideosByCourseContentIdService findAllVideosByCourseContentIdService) {
    return new FindAllVideosByCourseContentIdApplication(findAllVideosByCourseContentIdService);
  }
}
