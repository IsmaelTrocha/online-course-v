package com.onlinecourse.course.domain.entities;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

  private Long id;
  private String title;
  private String description;
  private List<CourseContent> courseContents;
  private Language language;
  private Double price;
  private String createdBy;
  private LocalDateTime creationDate;
  private Level level;
}
