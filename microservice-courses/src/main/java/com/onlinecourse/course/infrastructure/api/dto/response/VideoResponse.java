package com.onlinecourse.course.infrastructure.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class VideoResponse {

  private Long id;
  private String title;
  private String code;

}
