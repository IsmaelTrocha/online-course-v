package com.onlinecourse.student.config;

import com.onlinecourse.student.infrastructure.jpa.adapter.security.SecurityService;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class FeignClientConfiguration implements RequestInterceptor {

  private final SecurityService securityService;
  @Override
  public void apply(RequestTemplate requestTemplate) {
    try{

      requestTemplate.header("Authorization %s",securityService.getUserToken());

    }catch(Exception e){
      throw new IllegalStateException(e.getMessage());
    }
  }
}
