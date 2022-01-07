package io.github.tiagosouza.studentjavaapi.repository.student;

import io.github.tiagosouza.studentjavaapi.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
