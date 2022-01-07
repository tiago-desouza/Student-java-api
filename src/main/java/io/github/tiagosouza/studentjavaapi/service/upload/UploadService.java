package io.github.tiagosouza.studentjavaapi.service.upload;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {

    void save(MultipartFile file);

}
