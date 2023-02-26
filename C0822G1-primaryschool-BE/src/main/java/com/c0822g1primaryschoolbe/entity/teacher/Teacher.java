package com.c0822g1primaryschoolbe.entity.teacher;

import com.c0822g1primaryschoolbe.entity.account.Account;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;

import javax.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;
    @Column(columnDefinition = "varchar(45)")
    private String teacherName;
    private String dateOfBirth;
    private Boolean gender;
    @Column(columnDefinition = "varchar(45)",unique = true)
    private String phoneNumber;
    @Column(columnDefinition = "varchar(45)",unique = true)
    private String idCard;
    @Column(columnDefinition = "varchar(45)",unique = true)
    private String email;
    private Boolean flagDelete;
    private String teacherType;
    private Boolean teacherStatus;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;
    @ManyToOne()
    @JoinColumn(name = "degree_id",nullable = false,referencedColumnName = "degree_id")
    private Degree degree;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clazz_id")
    private Clazz clazz;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(Boolean flagDelete) {
        this.flagDelete = flagDelete;
    }

    public String getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(String teacherType) {
        this.teacherType = teacherType;
    }

    public Boolean getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(Boolean teacherStatus) {
        this.teacherStatus = teacherStatus;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
}
