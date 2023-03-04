package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import com.c0822g1primaryschoolbe.repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService implements ITeacherService{
    @Autowired
    private ITeacherRepository teacherRepository;

    /**
     * Create by TuanNDN
     * @param teacherId
     * @return
     */
    @Override
    public Optional<Teacher> findByIdTeacher(Long teacherId) {
        return teacherRepository.findByIdTeacher(teacherId);
    }

    /**
     * Create by TuanNDN
     * @return
     */
    @Override
    public List<Teacher> showListTeacher() {
        return teacherRepository.showListTeacher();
    }
}
