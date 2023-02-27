package com.c0822g1primaryschoolbe.entity;

import com.c0822g1primaryschoolbe.entity.account.Account;
import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.student.PointManagement;
import com.c0822g1primaryschoolbe.entity.teacher.Degree;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ClassStudentDto implements Validator {
    private Long clazzId;
    private String clazzName;
    private Integer year;
    private String schoolYear;
    private TimeTable timeTable;
    private Block block;
    private Teacher teacher;
    private Long studentId;
    private String img;
    private String studentName;
    private String dateOfBirth;
    private Boolean gender;
    private String fatherName;
    private String phoneNumberFather;
    private String fatherJob;
    private String motherName;
    private String phoneNumberMother;
    private String motherJob;
    private String religion;
    private String address;
    private Boolean studentStatus;
    private PointManagement pointManagement;
    private Clazz clazz;

    public ClassStudentDto() {
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public TimeTable getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPhoneNumberFather() {
        return phoneNumberFather;
    }

    public void setPhoneNumberFather(String phoneNumberFather) {
        this.phoneNumberFather = phoneNumberFather;
    }

    public String getFatherJob() {
        return fatherJob;
    }

    public void setFatherJob(String fatherJob) {
        this.fatherJob = fatherJob;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getPhoneNumberMother() {
        return phoneNumberMother;
    }

    public void setPhoneNumberMother(String phoneNumberMother) {
        this.phoneNumberMother = phoneNumberMother;
    }

    public String getMotherJob() {
        return motherJob;
    }

    public void setMotherJob(String motherJob) {
        this.motherJob = motherJob;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(Boolean studentStatus) {
        this.studentStatus = studentStatus;
    }

    public PointManagement getPointManagement() {
        return pointManagement;
    }

    public void setPointManagement(PointManagement pointManagement) {
        this.pointManagement = pointManagement;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
