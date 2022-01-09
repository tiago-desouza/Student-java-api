package io.github.tiagosouza.studentjavaapi.utils.exceptioncustons;

public class IdStudentNotFound extends RuntimeException {

    public IdStudentNotFound(String message) {
        super(message);
    }

}
