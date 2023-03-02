package com.c0822g1primaryschoolbe.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class TeacherDto  {
    private Long teacherId;
//    private String blockName;
//    private TeacherDto teacher;


    public TeacherDto() {
    }

    public Long getTeacherId() {
        return teacherId;

    }

        public void setTeacherId(Long teacherId) {
            this.teacherId = teacherId;
        }


}
