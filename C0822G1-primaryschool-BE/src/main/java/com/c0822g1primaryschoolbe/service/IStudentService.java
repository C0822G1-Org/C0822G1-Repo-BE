package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.student.Student;

import java.util.List;

public interface IStudentService {
    Student findById(Long id);
    List<Student> findAll();
}
