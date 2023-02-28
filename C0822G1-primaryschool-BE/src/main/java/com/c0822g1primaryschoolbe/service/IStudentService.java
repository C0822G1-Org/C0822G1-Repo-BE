package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.student.Student;

import java.util.Optional;

public interface IStudentService {
    /**
     * Create by : NuongHT
     * Date create: 27/02/2023
     *
     */
    Optional<Student> findById(Long id);
}
