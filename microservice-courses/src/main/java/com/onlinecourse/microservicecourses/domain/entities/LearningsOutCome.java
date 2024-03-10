package com.onlinecourse.microservicecourses.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class LearningsOutCome {

  private Long id;
  private Course courseId;
  private String firstLearnOutCome;
  private String secondLearnOutCome;
  private String thirdLearnOutCome;

}
