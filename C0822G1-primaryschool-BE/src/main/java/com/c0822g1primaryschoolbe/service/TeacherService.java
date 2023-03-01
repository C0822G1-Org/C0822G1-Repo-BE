package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import com.c0822g1primaryschoolbe.repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherService implements ITeacherService{
    @Autowired
    private ITeacherRepository teacherRepository;

    @Override
    public Optional<Teacher> findByIdTeacher(Long teacherId) {
        return teacherRepository.findByIdTeacher(teacherId);
    }
}
