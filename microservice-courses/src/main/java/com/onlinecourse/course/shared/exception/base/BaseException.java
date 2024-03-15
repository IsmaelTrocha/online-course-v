package com.onlinecourse.course.shared.exception.base;

import com.onlinecourse.course.shared.exception.code.ExceptionCode;
import java.io.Serial;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BaseException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = -824690113517284691L;
  private final boolean retryable;
  private final HttpStatus status;
  private final String code;
  private final String message;
  private final LocalDateTime date;
  private final ExceptionCode exceptionCode;
  private final String id = UUID.randomUUID().toString();
  private Throwable cause;

  protected BaseException(boolean retryable, HttpStatus status, String message,
      ExceptionCode exceptionCode) {
    this.retryable = retryable;
    this.code = exceptionCode.getCode();
    this.message = message;
    this.status = status;
    this.exceptionCode = exceptionCode;
    this.date = LocalDateTime.now(ZoneId.systemDefault());
  }

}
