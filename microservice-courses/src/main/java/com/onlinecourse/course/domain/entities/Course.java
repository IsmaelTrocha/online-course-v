package com.onlinecourse.course.domain.entities;

import java.util.List;
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
  private List<CourseContent> courseContents;
  private List<Languages> languages;
}
