package io.github.tiagosouza.studentjavaapi.service.student;

import io.github.tiagosouza.studentjavaapi.model.student.Student;

import java.util.List;

public interface StudentService {

    void save(Student student);
    void deleteById(Long studentId);
    Student findById(Long id);
    List<Student> findAll();
    List<Student> findByName(String name);
}
