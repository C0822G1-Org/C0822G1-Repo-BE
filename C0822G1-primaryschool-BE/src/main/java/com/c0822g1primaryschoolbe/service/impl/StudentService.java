package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.repository.IStudentRepository;
import com.c0822g1primaryschoolbe.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    IStudentRepository iStudentRepository;
    @Override
    public Optional<Student> findById(Long id) {
        return iStudentRepository.findById(id);
    }


}
