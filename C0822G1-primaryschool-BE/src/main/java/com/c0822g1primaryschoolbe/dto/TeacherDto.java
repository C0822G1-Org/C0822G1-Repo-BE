package com.c0822g1primaryschoolbe.dto;

public class TeacherDto {
    private Long teacherId;
    private String teacherName;
    private String dateOfBirth;
    private Boolean gender;
    private Long degreeId;
    private String teacherType;
    private String idCard;
    private String email;
    private String phoneNumber;

    public TeacherDto( String teacherName, String dateOfBirth, Boolean gender, Long degreeId, String teacherType, String idCard, String email, String phoneNumber,Long teacherId) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.degreeId = degreeId;
        this.teacherType = teacherType;
        this.idCard = idCard;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Long getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Long degreeId) {
        this.degreeId = degreeId;
    }

    public String getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(String teacherType) {
        this.teacherType = teacherType;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
