package com.c0822g1primaryschoolbe.dto;
import com.sun.istack.NotNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;

public class ClazzDto implements Validator {
    @NotBlank
    @NotNull
    private String clazzName;
    @NotBlank
    @NotNull
    private String schoolYear;
    private BlockDto blockDto;
    private TeacherDto teacherDto;




    public ClazzDto() {
    }

    public ClazzDto(String clazzName, String schoolYear, BlockDto blockDto, TeacherDto teacherDto) {
        this.clazzName = clazzName;
        this.schoolYear = schoolYear;
        this.blockDto = blockDto;
        this.teacherDto = teacherDto;
    }

    public BlockDto getBlockDto() {
        return blockDto;
    }

    public void setBlockDto(BlockDto blockDto) {
        this.blockDto = blockDto;
    }

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
