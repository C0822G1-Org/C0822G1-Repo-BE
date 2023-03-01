package com.c0822g1primaryschoolbe.service.teacher.impl;

import com.c0822g1primaryschoolbe.dto.TeacherDto;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import com.c0822g1primaryschoolbe.repository.ITeacherRepository;
import com.c0822g1primaryschoolbe.service.teacher.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private ITeacherRepository iTeacherRepository;

    @Override
    public void editInfoTeacher(String teacherName, String dateOfBirth, Boolean gender, Long degreeId, String teacherType, String idCard, String email, String phoneNumber, Long teacherId) {
        iTeacherRepository.editInfoTeacher(teacherName, dateOfBirth, gender, degreeId, teacherType, idCard, email, phoneNumber, teacherId);
    }
}