package com.onlinecourse.course.infrastructure.jpa.repository.coursecontent;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.onlinecourse.course.infrastructure.jpa.repository.course.CourseDto;
import com.onlinecourse.course.infrastructure.jpa.repository.video.VideoDto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "COURSE_CONTENT")
@Entity
public class CourseContentDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "course_id")
  @JsonIgnore
  private CourseDto courseId;
  private String tittle;
  @OneToMany(mappedBy = "courseContentId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<VideoDto> videos;
  private String duration;
}
