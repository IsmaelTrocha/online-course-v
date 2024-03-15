package com.onlinecourse.course.infrastructure.api.dto.response;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class MessageResponse {

  private String code;
  private String message;
  private LocalDateTime date;
}
