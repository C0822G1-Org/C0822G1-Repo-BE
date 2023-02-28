package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.clazz.IClazzName;
import com.c0822g1primaryschoolbe.entity.clazz.IClazzTeacher;
import com.c0822g1primaryschoolbe.entity.clazz.IClazzYear;

import java.util.List;

public interface IClazzService {
    List<IClazzYear> getListYear();

    List<IClazzName> getListClazzName(int year, String name);

    IClazzTeacher getClazzTeacher(int year, Long clazzId);

    void editTeacher(Long teacherId, Long clazzId);

}
