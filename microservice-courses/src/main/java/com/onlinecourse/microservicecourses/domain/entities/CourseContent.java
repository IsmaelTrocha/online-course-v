package com.onlinecourse.microservicecourses.domain.entities;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseContent {

  private Long id;
  private Course courseId;
  private List<Video> videos;
  private Boolean duration;

}
