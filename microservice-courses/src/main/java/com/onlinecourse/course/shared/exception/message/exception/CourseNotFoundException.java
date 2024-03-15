package com.onlinecourse.course.shared.exception.message.exception;

import com.onlinecourse.course.shared.exception.base.BaseException;
import com.onlinecourse.course.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class CourseNotFoundException extends BaseException {

  public CourseNotFoundException(String message) {
    super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.COURSE_NOT_FOUND_EXCEPTION);
  }

}
