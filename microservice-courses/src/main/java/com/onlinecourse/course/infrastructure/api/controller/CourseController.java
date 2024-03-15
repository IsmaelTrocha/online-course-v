package com.onlinecourse.course.infrastructure.api.controller;

import com.onlinecourse.course.application.course.CreateCourseApplication;
import com.onlinecourse.course.application.course.FindCourseByIdApplication;
import com.onlinecourse.course.infrastructure.api.dto.request.CourseRequest;
import com.onlinecourse.course.infrastructure.api.dto.response.CourseResponse;
import com.onlinecourse.course.infrastructure.api.dto.response.MessageResponse;
import com.onlinecourse.course.infrastructure.api.mapper.request.CourseRequestMapper;
import com.onlinecourse.course.infrastructure.api.mapper.response.CourseResponseMapper;
import com.onlinecourse.course.shared.exception.code.MessageCode;
import com.onlinecourse.course.shared.utils.MessageUtils;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
  private final FindCourseByIdApplication findCourseByIdApplication;
  private final MessageUtils messageUtils;
  private final CourseRequestMapper courseRequestMapper;
  private final CourseResponseMapper courseResponseMapper;

  @PostMapping
  public ResponseEntity<MessageResponse> createCourse(@RequestBody CourseRequest courseRequest,
      @RequestHeader String createdBy) {
    createCourseApplication.createCourse(courseRequestMapper.toEntity(courseRequest), createdBy);
    return new ResponseEntity<>(
        new MessageResponse(
            messageUtils.getMessage(MessageCode.COURSE_CREATED_SUCCESSFULLY.getCode()),
            messageUtils.getMessage(MessageCode.COURSE_CREATED_SUCCESSFULLY.getType()),
            LocalDateTime.now()),
        HttpStatus.CREATED);
  }

  @GetMapping(path = "/search/{id}")
  public ResponseEntity<CourseResponse> findCourseById(@PathVariable("id") Long id) {
    return new ResponseEntity<>(courseResponseMapper.toDto(
        findCourseByIdApplication.findCourseById(id)), HttpStatus.OK);
  }
}
