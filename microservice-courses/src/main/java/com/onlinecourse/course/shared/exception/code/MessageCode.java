package com.onlinecourse.course.shared.exception.code;

import lombok.Getter;

@Getter
public enum MessageCode {

  COURSE_CREATED_SUCCESSFULLY("MESSAGE-001", "Message.COURSE_CREATED_SUCCESSFULLY");

  private final String code;
  private final String type;

  MessageCode(String code, String type) {
    this.code = code;
    this.type = type;
  }

}
