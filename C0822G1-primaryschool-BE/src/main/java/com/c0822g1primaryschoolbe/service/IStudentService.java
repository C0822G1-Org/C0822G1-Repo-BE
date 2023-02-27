package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.student.Student;

public interface IStudentService {

    void create(String img, String studentName,
                String dateOfBirth, Boolean gender,
                String fatherName, String phoneNumberFather,
                String fatherJob, String motherName,
                String phoneNumberMother, String motherJob,
                String religion, String address, long clazzId
    );


    Student findId(long id);

    void update(String img, String studentName,
                String dateOfBirth, Boolean gender,
                String fatherName, String phoneNumberFather,
                String fatherJob, String motherName,
                String phoneNumberMother, String motherJob,
                String religion, String address, long clazzId);
}
