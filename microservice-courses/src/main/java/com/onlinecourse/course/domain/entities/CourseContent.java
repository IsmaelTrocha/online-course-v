package com.onlinecourse.course.domain.entities;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseContent {

  private Long id;
  private Course course;
  private String title;
  private List<Video> videos;
  private String duration;

}
