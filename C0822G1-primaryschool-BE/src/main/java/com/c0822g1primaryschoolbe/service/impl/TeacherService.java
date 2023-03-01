package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.dto.TeacherDto;

import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import com.c0822g1primaryschoolbe.repository.ITeacherRepository;
import com.c0822g1primaryschoolbe.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private ITeacherRepository iTeacherRepository;
    @Override
    public List<Teacher> showListTeacher() {
        return iTeacherRepository.showListTeacher();
    }
}
