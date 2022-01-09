package io.github.tiagosouza.studentjavaapi.dto.student;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;

public class StudentDto {

    private Long id;
    @JsonProperty(value = "nome")
    private String name;
    @JsonProperty(value = "idade")
    private Integer yearsOld;
    @JsonProperty(value = "classe")
    private String classroom;
    @JsonProperty(value = "notas")
    private Double schoolGrades;

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

    public void setYearsOld(Integer yearsOld) {
        this.yearsOld = yearsOld;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Double getSchoolGrades() {
        return schoolGrades;
    }

    public void setSchoolGrades(Double schoolGrades) {
        this.schoolGrades = schoolGrades;
    }
}
