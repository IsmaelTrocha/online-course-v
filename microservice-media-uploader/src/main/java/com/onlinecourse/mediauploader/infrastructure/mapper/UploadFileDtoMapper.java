package com.onlinecourse.mediauploader.infrastructure.mapper;

import com.onlinecourse.mediauploader.domain.entity.FileUpload;
import com.onlinecourse.mediauploader.infrastructure.jpa.repository.FileUploadDto;
import com.onlinecourse.mediauploader.shared.EntityToDto;

/* Implementar la dependencia de MapStruct para crear los mappers.*/
 public interface UploadFileDtoMapper extends EntityToDto<FileUpload, FileUploadDto> {

}
