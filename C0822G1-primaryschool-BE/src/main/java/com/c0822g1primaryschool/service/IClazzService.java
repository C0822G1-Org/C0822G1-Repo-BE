package com.c0822g1primaryschool.service;

import com.c0822g1primaryschool.entity.clazz.*;
import com.c0822g1primaryschool.entity.clazz.Clazz;

import java.util.List;

public interface IClazzService {
    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     */
    List<IClazzYear> getListYear();

    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     */
    List<IClazzName> getListClazzName(int year, String name);

    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     */
    IClazzTeacher getClazzTeacher(int year, Long clazzId);

    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     */
    void editTeacher(Long teacherId, Long clazzId);

    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     */
    Clazz getClazzById(Long clazzId);

    /**
     * Create: HoangMN
     * @return
     */
    List<Clazz> getAll();
}
