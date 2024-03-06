package com.onlinecourse.student.config;

import io.micrometer.observation.ObservationRegistry;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.server.resource.web.reactive.function.client.ServletBearerExchangeFilterFunction;
import org.springframework.web.reactive.function.client.DefaultClientRequestObservationConvention;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

  @Bean
  @LoadBalanced
  public WebClient.Builder webClientBuilder(ObservationRegistry observerRegistry){
    return WebClient.builder()
        .filter(new ServletBearerExchangeFilterFunction())
        .observationRegistry(observerRegistry)
        .observationConvention(new DefaultClientRequestObservationConvention());
  }

  @Bean
  public WebClient webClient (WebClient.Builder webClient){
    return webClient.build();
  }
}
