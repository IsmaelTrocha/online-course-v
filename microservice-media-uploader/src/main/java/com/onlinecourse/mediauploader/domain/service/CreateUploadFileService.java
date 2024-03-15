package com.onlinecourse.mediauploader.domain.service;

import com.onlinecourse.mediauploader.domain.entity.FileUpload;
import org.springframework.web.multipart.MultipartFile;

public interface CreateUploadFileService {

  FileUpload save(MultipartFile file);

}
