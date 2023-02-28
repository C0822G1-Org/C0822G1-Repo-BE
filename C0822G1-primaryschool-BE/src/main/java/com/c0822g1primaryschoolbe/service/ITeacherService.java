package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.teacher.ITeacherInfo;

import java.util.List;

public interface ITeacherService {
    List<ITeacherInfo> getListNameTeacher(int year);

<<<<<<< HEAD
    ITeacherInfo getNameTeacher(String idCard,int year);
=======
    ITeacherInfo getNameTeacher(String name,int year);
>>>>>>> 47b9c4e720c2d316b8ea035cf4a1373a2eca0315
}
