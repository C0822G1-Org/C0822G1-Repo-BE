package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.clazz.IClazzName;
import com.c0822g1primaryschoolbe.entity.clazz.IClazzTeacher;
import com.c0822g1primaryschoolbe.entity.clazz.IClazzYear;

import java.util.List;

public interface IClazzService {
    List<IClazzYear> getListYear();

    List<IClazzName> getListName(int year, String name);

    IClazzTeacher getClazzTeacher(int year, int clazzId);

    void editTeacher(int teacherId, int clazzId);
}
