package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.teacher.ITeacherInfo;
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
    public List<ITeacherInfo> getListNameTeacher(int year) {
        return iTeacherRepository.getListNameTeacher(year);
    }

    @Override
<<<<<<< HEAD
    public ITeacherInfo getNameTeacher(String idCard, int year) {
        return iTeacherRepository.getNameTeacher(idCard,year);
=======
    public ITeacherInfo getNameTeacher(String name, int year) {
        return iTeacherRepository.getNameTeacher(name,year);
>>>>>>> 47b9c4e720c2d316b8ea035cf4a1373a2eca0315
    }
}
