package com.onlinecourse.course.infrastructure.api.dto.response;

import com.onlinecourse.course.domain.entities.Language;
import com.onlinecourse.course.domain.entities.Level;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CourseResponse {


  private Long id;
  private String title;
  private String description;
  private List<CourseContentResponse> courseContents;
  private Language language;
  private Double price;
  private Level level;
  private String duration;
}
