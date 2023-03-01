package com.c0822g1primaryschoolbe.dto;

public class ClazzStudentDto {
    private Long clazzId;
    private String clazzName;
    private Long teacherId;
    private String teacherName;
    private Long studentId;
    private String studentName;


    public ClazzStudentDto() {
    }

    public ClazzStudentDto(Long clazzId, String clazzName, Long teacherId, String teacherName, Long studentId, String studentName) {
        this.clazzId = clazzId;
        this.clazzName = clazzName;
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Long getClazzId() {
        return clazzId;
    }

    public void setClazzId(Long clazzId) {
        this.clazzId = clazzId;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
