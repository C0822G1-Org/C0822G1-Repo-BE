package com.c0822g1primaryschool.service;

import com.c0822g1primaryschool.dto.teacher.TeacherViewDto;
import com.c0822g1primaryschool.entity.teacher.ITeacherInfo;

import java.util.List;

public interface ITeacherService {
    List<ITeacherInfo> getListNameTeacher(int year);

    ITeacherInfo getNameTeacher(String idCard,int year);

    TeacherViewDto findIdTeacher(Long accountId);

}
