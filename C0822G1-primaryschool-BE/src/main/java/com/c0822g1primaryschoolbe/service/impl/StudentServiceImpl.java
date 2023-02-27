package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.repository.IStudentRepository;
import com.c0822g1primaryschoolbe.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    IStudentRepository iStudentRepository;
    @Override
    public Student findById(Long id) {
        return iStudentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return iStudentRepository.findAll();
    }
}
