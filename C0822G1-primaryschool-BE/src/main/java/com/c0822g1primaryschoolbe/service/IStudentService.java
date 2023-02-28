package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.student.Student;

public interface IStudentService {

    void create(Student student);


    Student findId(long studentId);

    void update(Student student);
}
