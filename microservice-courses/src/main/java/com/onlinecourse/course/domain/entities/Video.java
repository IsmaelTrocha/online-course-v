package com.onlinecourse.course.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {

  private Long id;
  private String title;
  private String code;
  private Double duration;


}
