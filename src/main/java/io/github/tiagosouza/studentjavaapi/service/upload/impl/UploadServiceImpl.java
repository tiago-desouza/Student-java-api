package io.github.tiagosouza.studentjavaapi.service.upload.impl;

import io.github.tiagosouza.studentjavaapi.model.student.Student;
import io.github.tiagosouza.studentjavaapi.repository.student.StudentRepository;
import io.github.tiagosouza.studentjavaapi.service.upload.UploadService;
import io.github.tiagosouza.studentjavaapi.service.util.upload.FileHelperStudentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class UploadServiceImpl implements UploadService {

    private StudentRepository repository;

    @Autowired
    public UploadServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(MultipartFile file) {
        List<Student> students = FileHelperStudentUtil.txtToData(file);
        repository.saveAll(students);
    }
}
