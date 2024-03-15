package com.onlinecourse.mediauploader.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileUpload {

  private Long id;
  private String code;
  private String title;
  private Double duration;

}
