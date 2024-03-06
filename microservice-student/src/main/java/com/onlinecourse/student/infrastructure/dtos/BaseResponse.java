package com.onlinecourse.student.infrastructure.dtos;

public record BaseResponse(String [] errorMessage) {

  public boolean hasError(String [] errorMessage) {
    return errorMessage != null && errorMessage.length > 0;
  }
}
