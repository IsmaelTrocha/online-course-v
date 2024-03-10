package com.onlinecourse.student.infrastructure.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KeycloakUserDto {

  private String id;
  private String origin;
  private String username;
  private Boolean enabled;
  private Boolean emailVerified;
  private String firstName;
  private String lastName;
  private String email;

}
