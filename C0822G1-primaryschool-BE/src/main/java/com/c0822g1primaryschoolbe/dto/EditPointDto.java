package com.c0822g1primaryschoolbe.dto;

public class EditPointDto {
    private Long id;
    private Double semesterOne;
    private Double semesterTwo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSemesterOne() {
        return semesterOne;
    }

    public void setSemesterOne(Double semesterOne) {
        this.semesterOne = semesterOne;
    }

    public Double getSemesterTwo() {
        return semesterTwo;
    }

    public void setSemesterTwo(Double semesterTwo) {
        this.semesterTwo = semesterTwo;
    }
}
