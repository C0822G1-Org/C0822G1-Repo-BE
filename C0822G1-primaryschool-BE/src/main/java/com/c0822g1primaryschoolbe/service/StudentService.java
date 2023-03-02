package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService{

    @Autowired
    private IStudentRepository studentRepository;
    /**
     * Create by : TuanNDN
     * @return
     */
    @Override
    public List<Student> showListStudent() {
        return studentRepository.showListStudent();
    }
}
