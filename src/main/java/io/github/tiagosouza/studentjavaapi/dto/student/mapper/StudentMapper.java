package io.github.tiagosouza.studentjavaapi.dto.student.mapper;

import io.github.tiagosouza.studentjavaapi.dto.student.StudentDto;
import io.github.tiagosouza.studentjavaapi.model.student.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentMapper {

    public static List<StudentDto> toListDto(List<Student> studentList) {
        return studentList.stream().map(StudentMapper::toDto).collect(Collectors.toList());
    }

    public static StudentDto toDto(Student student) {

        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setYearsOld(student.getYearsOld());
        studentDto.setClassroom(student.getClassroom());
        studentDto.setSchoolGrades(student.getSchoolGrades());

        return studentDto;
    }

    public static Student toEntity(StudentDto studentDto) {

        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setYearsOld(studentDto.getYearsOld());
        student.setClassroom(studentDto.getClassroom());
        student.setSchoolGrades(studentDto.getSchoolGrades());

        return student;
    }

}
