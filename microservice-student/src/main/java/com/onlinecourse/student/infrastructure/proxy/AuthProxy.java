package com.onlinecourse.student.infrastructure.proxy;

import com.onlinecourse.student.config.FeignClientConfiguration;
import com.onlinecourse.student.infrastructure.dtos.KeycloakUserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "microservice-user", configuration = FeignClientConfiguration.class)
public interface AuthProxy {

  @GetMapping(path = "/keycloak/user/search/{username}")
  KeycloakUserDto getUserById(@PathVariable("username") String username);

}
