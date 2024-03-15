package com.onlinecourse.course.infrastructure.api.controller;

import com.onlinecourse.course.application.course.CreateCourseApplication;
import com.onlinecourse.course.infrastructure.api.dto.request.CourseRequest;
import com.onlinecourse.course.infrastructure.api.dto.response.MessageResponse;
import com.onlinecourse.course.infrastructure.api.mapper.request.CourseRequestMapper;
import com.onlinecourse.course.shared.utils.MessageUtils;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/")
@AllArgsConstructor
public class CourseController {

  private final CreateCourseApplication createCourseApplication;
  private final MessageUtils messageUtils;
  private final CourseRequestMapper courseRequestMapper;

  @PostMapping
  public ResponseEntity<MessageResponse> createCourse(@RequestBody CourseRequest courseRequest,
      @RequestHeader String createdBy) {
    createCourseApplication.createCourse(courseRequestMapper.toEntity(courseRequest), createdBy);
    return new ResponseEntity<>(
        new MessageResponse("201", "Course Created Successfully!!", LocalDateTime.now()),
        HttpStatus.CREATED);
  }
}
