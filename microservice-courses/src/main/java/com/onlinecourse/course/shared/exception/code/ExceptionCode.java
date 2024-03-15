package com.onlinecourse.course.shared.exception.code;

import lombok.Getter;

@Getter
public enum ExceptionCode {

  COURSE_NOT_FOUND_EXCEPTION("ERROR_001", "Exception.COURSE_NOT_FOUND_EXCEPTION");

  private final String code;
  private final String type;

  ExceptionCode(String code, String type) {
    this.code = code;
    this.type = type;
  }

}
