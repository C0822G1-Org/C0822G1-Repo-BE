package com.c0822g1primaryschoolbe.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class TeacherDto implements Validator {
    private Long teacherId;

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
