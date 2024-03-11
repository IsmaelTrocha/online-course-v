package com.onlinecourse.course.student.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Student {

  private String id;
  private String name;
  private String lastName;
  private String email;

}
