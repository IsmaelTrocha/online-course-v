package com.onlinecourse.student.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student {

  private Long id;
  private String name;
  private String lastName;
  private String email;

}
