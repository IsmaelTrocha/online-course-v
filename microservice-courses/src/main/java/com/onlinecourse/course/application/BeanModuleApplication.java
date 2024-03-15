package com.onlinecourse.course.application;

import com.onlinecourse.course.application.course.CreateCourseApplication;
import com.onlinecourse.course.application.course.FindCourseByIdApplication;
import com.onlinecourse.course.application.video.CreateVideoApplication;
import com.onlinecourse.course.application.video.FindVideoByIdApplication;
import com.onlinecourse.course.application.video.UpdateVideoByIdApplication;
import com.onlinecourse.course.domain.services.course.CreateCourseService;
import com.onlinecourse.course.domain.services.course.FindCourseByIdService;
import com.onlinecourse.course.domain.services.video.CreateVideoService;
import com.onlinecourse.course.domain.services.video.FindVideoByIdService;
import com.onlinecourse.course.domain.services.video.UpdateVideoService;
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
}
