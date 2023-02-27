package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.repository.StudentRepository;
import com.c0822g1primaryschoolbe.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void create(String img, String studentName, String dateOfBirth, Boolean gender, String fatherName, String phoneNumberFather, String fatherJob, String motherName, String phoneNumberMother, String motherJob, String religion, String address, long clazzId) {
        studentRepository.createStudent(img, studentName, dateOfBirth, gender, fatherName, phoneNumberFather, fatherJob, motherName, phoneNumberMother, motherJob, religion, address, clazzId);
    }

    @Override
    public Student findId(long id) {
        return studentRepository.findId(id);
    }

    @Override
    public void update(String img, String studentName, String dateOfBirth, Boolean gender, String fatherName, String phoneNumberFather, String fatherJob, String motherName, String phoneNumberMother, String motherJob, String religion, String address, long clazzId) {
        studentRepository.updateStudent(img, studentName, dateOfBirth, gender, fatherName, phoneNumberFather, fatherJob, motherName, phoneNumberMother, motherJob, religion, address, clazzId);
    }
}
