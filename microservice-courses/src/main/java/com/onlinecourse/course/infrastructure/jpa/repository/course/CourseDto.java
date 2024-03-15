package com.onlinecourse.course.infrastructure.jpa.repository.course;

import com.onlinecourse.course.domain.entities.Language;
import com.onlinecourse.course.domain.entities.Level;
import com.onlinecourse.course.infrastructure.jpa.repository.coursecontent.CourseContentDto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@Table(name = "COURSES")
@NoArgsConstructor
public class CourseDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String description;
  @Enumerated(EnumType.STRING)
  private Language language;
  @NonNull
  private String createdBy;
  private LocalDateTime creationDate;
  private Double price;
  @Enumerated(EnumType.STRING)
  private Level level;
  private String duration;
}
