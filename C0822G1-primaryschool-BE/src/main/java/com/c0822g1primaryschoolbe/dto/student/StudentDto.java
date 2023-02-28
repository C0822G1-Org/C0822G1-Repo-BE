package com.c0822g1primaryschoolbe.dto.student;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.student.PointManagement;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class StudentDto implements Validator {
    @NotBlank(message = "Không được để trống!")
    private Long studentId;
    @NotBlank(message = "Không được để trống!")
    private String img;
    @NotBlank(message = "Không được để trống!")
    private String studentName;
    @NotBlank(message = "Không được để trống!")
    private String dateOfBirth;
    @NotBlank(message = "Không được để trống!")
    private Boolean gender;
    @NotBlank(message = "Không được để trống!")
    private String fatherName;
    @NotBlank(message = "Không được để trống!")
    private String phoneNumberFather;
    @NotBlank(message = "Không được để trống!")
    private String fatherJob;
    @NotBlank(message = "Không được để trống!")
    private String motherName;
    @NotBlank(message = "Không được để trống!")
    private String phoneNumberMother;
    @NotBlank(message = "Không được để trống!")
    private String motherJob;
    @NotBlank(message = "Không được để trống!")
    private String religion;
    @NotBlank(message = "Không được để trống!")
    private String address;  @NotBlank(message = "Không được để trống!")
    @NotBlank(message = "Không được để trống!")
    private Boolean studentStatus;
    private Boolean flagDelete;
    private PointManagement pointManagement;
    private Clazz clazz;

    public StudentDto() {
    }

    public StudentDto(Long studentId, String img, String studentName, String dateOfBirth, Boolean gender, String fatherName, String phoneNumberFather, String fatherJob, String motherName, String phoneNumberMother, String motherJob, String religion, String address, Boolean studentStatus, Boolean flagDelete, PointManagement pointManagement, Clazz clazz) {
        this.studentId = studentId;
        this.img = img;
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.fatherName = fatherName;
        this.phoneNumberFather = phoneNumberFather;
        this.fatherJob = fatherJob;
        this.motherName = motherName;
        this.phoneNumberMother = phoneNumberMother;
        this.motherJob = motherJob;
        this.religion = religion;
        this.address = address;
        this.studentStatus = studentStatus;
        this.flagDelete = flagDelete;
        this.pointManagement = pointManagement;
        this.clazz = clazz;
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

    public Boolean getFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(Boolean flagDelete) {
        this.flagDelete = flagDelete;
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
