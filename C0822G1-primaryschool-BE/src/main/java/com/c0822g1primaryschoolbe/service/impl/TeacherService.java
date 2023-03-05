package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.dto.teacher.ITeacherDto;
import com.c0822g1primaryschoolbe.entity.teacher.ITeacherInfo;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import com.c0822g1primaryschoolbe.repository.ITeacherRepository;
import com.c0822g1primaryschoolbe.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.c0822g1primaryschoolbe.dto.teacher.TeacherViewDto;

import java.util.List;

@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private ITeacherRepository iTeacherRepository;

    /**
     * Create by: TrungNQ
     * @param year
     * @return
     */
    @Override
    public List<ITeacherInfo> getListNameTeacher(int year) {
        return iTeacherRepository.getListNameTeacher(year);
    }

    @Override
    public ITeacherInfo getNameTeacher(String idCard, int year) {
        return iTeacherRepository.getNameTeacher(idCard, year);
    }


    @Override
    public TeacherViewDto findIdTeacher(Long accountId) {
        return iTeacherRepository.findIdTeacher(accountId);

    }

    @Override
    public ITeacherDto findByTeacherDto(Long teacherId) {
        return iTeacherRepository.findByTeacherDto(teacherId);
    }


    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: editInfoTeacher
     */

    @Override
    public void editInfoTeacher(String email, String phoneNumber, String address, Long teacherId) {
        iTeacherRepository.editInfoTeacher(email, phoneNumber, address, teacherId);
    }


}
