package io.github.tiagosouza.studentjavaapi.exception.student.advice;

import io.github.tiagosouza.studentjavaapi.exception.student.StudentNotFoundException;
import io.github.tiagosouza.studentjavaapi.exception.student.StudentServiceException;
import io.github.tiagosouza.studentjavaapi.utils.response.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class StudentServiceErrorAdvice {

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<ResponseMessage> handleRuntimeException(RuntimeException e) {
        return error(INTERNAL_SERVER_ERROR, e);
    }

    @ExceptionHandler({StudentServiceException.class, NullPointerException.class, SQLException.class})
    public ResponseEntity<ResponseMessage> handleStudentServiceException(StudentServiceException e) {
        return error(INTERNAL_SERVER_ERROR, e);
    }

    @ExceptionHandler({StudentNotFoundException.class})
    public ResponseEntity<ResponseMessage> handleStudentNotFoundException(StudentNotFoundException e) {
        return error(NOT_FOUND, e);
    }

    private ResponseEntity<ResponseMessage> error(HttpStatus status, Exception e) {
        return ResponseEntity.status(status).body(new ResponseMessage(e.getMessage()));
    }
}
