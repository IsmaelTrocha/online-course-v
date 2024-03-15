package com.onlinecourse.course.infrastructure.api.controller;

import com.onlinecourse.course.application.course.CreateCourseApplication;
import com.onlinecourse.course.application.course.FindCourseByIdApplication;
import com.onlinecourse.course.application.coursecontent.FindCourseContentByCourseIdApplication;
import com.onlinecourse.course.application.video.FindAllVideosByCourseContentIdApplication;
import com.onlinecourse.course.domain.entities.CourseContent;
import com.onlinecourse.course.infrastructure.api.dto.request.CourseRequest;
import com.onlinecourse.course.infrastructure.api.dto.response.CourseResponse;
import com.onlinecourse.course.infrastructure.api.dto.response.MessageResponse;
import com.onlinecourse.course.infrastructure.api.dto.response.VideoResponse;
import com.onlinecourse.course.infrastructure.api.mapper.request.CourseRequestMapper;
import com.onlinecourse.course.infrastructure.api.mapper.response.CourseContentResponseDtoMapper;
import com.onlinecourse.course.infrastructure.api.mapper.response.CourseResponseMapper;
import com.onlinecourse.course.infrastructure.api.mapper.response.VideosResponseMapper;
import com.onlinecourse.course.shared.utils.MessageUtils;
import java.time.LocalDateTime;
import java.util.List;
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
  private final CourseContentResponseDtoMapper courseContentResponseDtoMapper;
  private final FindCourseContentByCourseIdApplication findCourseContentByCourseIdApplication;
  private final FindAllVideosByCourseContentIdApplication findAllVideosByCourseContentIdApplication;
  private final VideosResponseMapper videosResponseMapper;

  @GetMapping(value = "/search/video/{id}")
  public ResponseEntity<List<VideoResponse>> findAll(@PathVariable Long id) {
    return new ResponseEntity<>(videosResponseMapper.toDto(
        findAllVideosByCourseContentIdApplication.findAllVideosByCourseContentId(id)),
        HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<MessageResponse> createCourse(@RequestBody CourseRequest courseRequest,
      @RequestHeader String createdBy) {
    createCourseApplication.createCourse(courseRequestMapper.toEntity(courseRequest), createdBy);
    return new ResponseEntity<>(
        new MessageResponse("201", "Course Created Successfully!!", LocalDateTime.now()),
        HttpStatus.CREATED);
  }

  @GetMapping(path = "/search/{id}")
  public ResponseEntity<CourseResponse> findCourseById(@PathVariable("id") Long id) {
    List<CourseContent> courses = findCourseContentByCourseIdApplication
        .findCourseContentsByCourseId(id);
    CourseResponse response = courseResponseMapper.toDto(
        findCourseByIdApplication.findCourseById(id));
    response.setCourseContents(courseContentResponseDtoMapper.toDto(courses));
    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
