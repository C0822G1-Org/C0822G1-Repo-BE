package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.repository.IStudentRepository;
import com.c0822g1primaryschoolbe.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public void create(Student student) {
        studentRepository.createStudent(student);
    }

    @Override
    public Student findId(long studentId) {
        return studentRepository.findId(studentId);
    }

    @Override
    public void update(Student student) {
        studentRepository.updateStudent(student);
    }
}
