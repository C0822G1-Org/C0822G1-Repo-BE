package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentService {


    Page<Student> findByName(String name, String status, Pageable pageable);



}
