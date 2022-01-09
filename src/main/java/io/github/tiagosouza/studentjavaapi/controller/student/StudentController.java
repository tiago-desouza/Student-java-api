package io.github.tiagosouza.studentjavaapi.controller.student;

import io.github.tiagosouza.studentjavaapi.dto.student.StudentDto;
import io.github.tiagosouza.studentjavaapi.exception.student.StudentNotFoundException;
import io.github.tiagosouza.studentjavaapi.exception.student.StudentServiceException;
import io.github.tiagosouza.studentjavaapi.model.student.Student;
import io.github.tiagosouza.studentjavaapi.service.student.StudentService;
import io.github.tiagosouza.studentjavaapi.utils.exceptioncustons.IdStudentNotFound;
import io.github.tiagosouza.studentjavaapi.utils.response.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static io.github.tiagosouza.studentjavaapi.dto.student.mapper.StudentMapper.toListDto;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<StudentDto>> findAllStudent() {
            List<Student> allStudent = studentService.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(toListDto(allStudent));

    }

    @DeleteMapping("/{idStudent}")
    public ResponseEntity<ResponseMessage> deleteStudentById(@PathVariable Long idStudent){
            studentService.deleteById(idStudent);
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Successfully deleted"));
    }
}
