package io.github.tiagosouza.studentjavaapi.service.student.impl;

import io.github.tiagosouza.studentjavaapi.exception.student.StudentNotFoundException;
import io.github.tiagosouza.studentjavaapi.model.student.Student;
import io.github.tiagosouza.studentjavaapi.repository.student.StudentRepository;
import io.github.tiagosouza.studentjavaapi.service.student.StudentService;
import io.github.tiagosouza.studentjavaapi.utils.exceptioncustons.IdStudentNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

        Optional<Student> studentById = studentRepository.findById(studentId);

        if (studentById.isEmpty()) {
            throw new StudentNotFoundException("No student found");
        }

        studentRepository.deleteById(studentId);

    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentRepository.findAll();

        if(studentList.isEmpty()) {
            throw new StudentNotFoundException("No student found");
        }

        return studentList;
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }
}
