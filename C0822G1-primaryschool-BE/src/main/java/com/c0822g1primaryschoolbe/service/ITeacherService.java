package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.teacher.ITeacherInfo;

import java.util.List;

public interface ITeacherService {
    List<ITeacherInfo> getListNameTeacher(int year);

    ITeacherInfo getNameTeacher(String name,int year);
}
