package com.onlinecourse.microservicecourses.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

  private Long id;
  private String tittle;
  private String description;
  private LearningsOutCome learningsOutCome;


}
