package io.github.tiagosouza.studentjavaapi.exception.student;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String message) {
        super(message);
    }
}
