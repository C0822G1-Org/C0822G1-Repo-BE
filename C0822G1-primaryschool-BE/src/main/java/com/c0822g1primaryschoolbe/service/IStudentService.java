package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.student.Student;

import java.util.Optional;

public interface IStudentService {
    Optional<Student> findById(Long id);
}
