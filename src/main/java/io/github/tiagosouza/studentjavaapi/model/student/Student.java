package io.github.tiagosouza.studentjavaapi.model.student;

import javax.persistence.*;

@Entity
@Table(name = "student_tbl")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "years_old")
    private Integer yearsOld;
    @Column(name = "classroom")
    private String classroom;
    @Column(name = "school_grades")
    private Double schoolGrades;

    public Student() {
    }

    public Student(String name, Integer yearsOld, String classroom, Double schoolGrades) {
        this.name = name;
        this.yearsOld = yearsOld;
        this.classroom = classroom;
        this.schoolGrades = schoolGrades;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(Integer oldYear) {
        this.yearsOld = oldYear;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classes) {
        this.classroom = classes;
    }

    public Double getSchoolGrades() {
        return schoolGrades;
    }

    public void setSchoolGrades(Double grades) {
        this.schoolGrades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearsOld=" + yearsOld +
                ", classroom='" + classroom + '\'' +
                ", schoolGrades=" + schoolGrades +
                '}';
    }
}
