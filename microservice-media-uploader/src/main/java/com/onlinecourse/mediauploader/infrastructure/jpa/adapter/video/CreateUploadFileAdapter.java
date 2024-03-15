package com.onlinecourse.mediauploader.infrastructure.jpa.adapter.video;

import com.onlinecourse.mediauploader.domain.entity.FileUpload;
import com.onlinecourse.mediauploader.domain.service.CreateUploadFileService;
import com.onlinecourse.mediauploader.infrastructure.jpa.repository.FileUploadDto;
import com.onlinecourse.mediauploader.infrastructure.jpa.repository.UploadFileRepository;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@AllArgsConstructor
public class CreateUploadFileAdapter implements CreateUploadFileService {

  private final UploadFileRepository uploadFileRepository;
  //private final UploadFileDtoMapper uploadFileDtoMapper;

  @Override
  public FileUpload save(MultipartFile file) {
    FileUploadDto uploadDto = new FileUploadDto();
    uploadDto.setCode(UUID.randomUUID().toString());
    uploadDto.setTitle(file.getOriginalFilename());

    return /*Aun no se que retornar.*/ null ;
  }
}
