package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.dto.teacher.TeacherViewDto;
import com.c0822g1primaryschoolbe.repository.ITeacherRepository;
import com.c0822g1primaryschoolbe.service.teacher.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private ITeacherRepository teacherRepository;

    @Override
    public TeacherViewDto findIdTeacher(Long accountId) {
        return teacherRepository.findIdTeacher(accountId);
    }
}
