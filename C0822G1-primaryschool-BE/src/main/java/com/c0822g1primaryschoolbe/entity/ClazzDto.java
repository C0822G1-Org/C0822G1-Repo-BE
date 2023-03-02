package com.c0822g1primaryschoolbe.entity;

import com.sun.istack.NotNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ClazzDto implements Validator {
    @NotBlank
    @NotNull
    @Pattern(regexp = "^[1-5][A-Z]{1,4}$", message = "Tên lớp học chưa đúng định dạng")
    @Size(min = 1)
    @Size(max = 15)
    private String clazzName;
    @NotBlank
    @NotNull
    @Pattern(regexp = "^[0-9]{4}$", message = "Niên khóa chưa đúng định dạng")
    private String schoolYear;
    private TeacherDto teacherDto;
    public TeacherDto getTeacherDto() {
        return teacherDto;
    }

    public void setTeacherDto(TeacherDto teacherDto) {
        this.teacherDto = teacherDto;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}