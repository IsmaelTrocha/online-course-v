package com.onlinecourse.mediauploader.application;

import com.onlinecourse.mediauploader.application.video.CreateUploadFileApplication;
import com.onlinecourse.mediauploader.domain.service.CreateUploadFileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {

  @Bean
  public CreateUploadFileApplication createUploadFileApplication(
      CreateUploadFileService createUploadFileService) {
    return new CreateUploadFileApplication(createUploadFileService);
  }
}
