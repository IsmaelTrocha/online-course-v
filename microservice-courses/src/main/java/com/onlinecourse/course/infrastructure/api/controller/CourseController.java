package com.onlinecourse.course.infrastructure.api.controller;

import com.onlinecourse.course.infrastructure.jpa.repository.course.CourseDto;
import com.onlinecourse.course.infrastructure.jpa.repository.course.CourseRepository;
import com.onlinecourse.course.infrastructure.jpa.repository.video.VideoDto;
import com.onlinecourse.course.infrastructure.jpa.repository.video.VideoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/")
@AllArgsConstructor
public class CourseController {

  private final CourseRepository courseRepository;
  private final VideoRepository videoRepository;

  @GetMapping(path = "/course/{id}")
  public CourseDto findById(@PathVariable("id") Long id) {
    return courseRepository.findById(id).orElse(null);
  }

  @GetMapping(path = "/video/{id}")
  public VideoDto findVideoById(@PathVariable("id") Long id) {
    return videoRepository.findById(id).orElse(null);
  }
}
