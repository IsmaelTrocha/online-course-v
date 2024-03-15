package com.onlinecourse.course.infrastructure.api.dto.request;

import com.onlinecourse.course.domain.entities.CourseContent;
import com.onlinecourse.course.domain.entities.Language;
import com.onlinecourse.course.domain.entities.Level;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseRequest {

  private Long id;
  private String title;
  private String description;
  private Language language;
  private Double price;
  private String createdBy;
  private LocalDateTime creationDate;
  private Level level;

}
