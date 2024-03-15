package com.onlinecourse.course.infrastructure.api.dto.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseContentResponse {

  private Long id;
  private String title;
  private List<VideoResponse> videos;
  private String duration;

}
