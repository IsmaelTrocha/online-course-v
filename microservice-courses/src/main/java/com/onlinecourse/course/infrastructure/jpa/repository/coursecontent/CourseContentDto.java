package com.onlinecourse.course.infrastructure.jpa.repository.coursecontent;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.onlinecourse.course.infrastructure.jpa.repository.course.CourseDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "COURSE_CONTENT")
@Entity
public class CourseContentDto {

  //
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "course_id")
  @JsonIgnore
  //AlOo+BznnQ7Gnq6+CXdFn4+r4fy7FlWY9iaQl2rb
  //AKIARO2INWQLXSSLDKAH
  private CourseDto course;
  private String title;
  private String duration;
}
