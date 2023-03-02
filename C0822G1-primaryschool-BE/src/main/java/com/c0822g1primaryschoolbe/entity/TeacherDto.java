package com.c0822g1primaryschoolbe.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class TeacherDto implements Validator {
    /**
     * Create by : TuanNDN
     * @return
     */
    private Long teacherId;
    private String teacherName;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}