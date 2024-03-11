package com.onlinecourse.course.student.infrastructure.jpa.adapter.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

  public String getUserToken() {

    Authentication authorization = SecurityContextHolder.getContext().getAuthentication();
    Jwt jwt = (Jwt) authorization.getPrincipal();
    return String.format("Bearer %s", jwt.getHeaders());
  }

  public String getUserId() {
    Authentication authorization = SecurityContextHolder.getContext().getAuthentication();
    Jwt jwt = (Jwt) authorization.getPrincipal();
    return String.format("Bearer %s", jwt.getHeaders());
  }

}
