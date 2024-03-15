package com.onlinecourse.mediauploader.application.video;

import com.onlinecourse.mediauploader.domain.entity.FileUpload;
import com.onlinecourse.mediauploader.domain.service.CreateUploadFileService;
import lombok.AllArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
public class CreateUploadFileApplication {

  private final CreateUploadFileService createUploadFileService;

  public FileUpload uploadFila(MultipartFile file) {
    return createUploadFileService.save(file);
  }
}
