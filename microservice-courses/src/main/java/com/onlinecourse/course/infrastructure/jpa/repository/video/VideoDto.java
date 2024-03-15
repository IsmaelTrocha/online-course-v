package com.onlinecourse.course.infrastructure.jpa.repository.video;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.onlinecourse.course.infrastructure.jpa.repository.coursecontent.CourseContentDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "VIDEOS")
public class VideoDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String code;
  @ManyToOne
  @JoinColumn(name = "course_content_id")
  @JsonIgnore
  private CourseContentDto courseContent;
  private String duration;
}
