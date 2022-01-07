package io.github.tiagosouza.studentjavaapi.service.student.impl;

import io.github.tiagosouza.studentjavaapi.model.student.Student;
import io.github.tiagosouza.studentjavaapi.repository.student.StudentRepository;
import io.github.tiagosouza.studentjavaapi.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteById(Long studentId) {

    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }
}
