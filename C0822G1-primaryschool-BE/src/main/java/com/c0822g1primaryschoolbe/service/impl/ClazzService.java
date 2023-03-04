package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.clazz.*;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.repository.IClazzRepository;
import com.c0822g1primaryschoolbe.service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzService implements IClazzService {
    @Autowired
    private IClazzRepository clazzRepository;

    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     */
    @Override
    public List<IClazzYear> getListYear() {
        return clazzRepository.getListYear();
    }


    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     */
    @Override
    public List<IClazzName> getListClazzName(int year, String name) {
        return clazzRepository.getListClazzName(year,name);
    }


    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     */
    @Override
    public IClazzTeacher getClazzTeacher(int year, Long clazzId) {
        return clazzRepository.getClazzTeacher(year,clazzId);
    }


    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     */
    @Override
    public void editTeacher(Long teacherId, Long clazzId) {
        clazzRepository.editTeacher(teacherId,clazzId);
    }


    /**
     * Create by:TrungNQ
     * Date create:27/2/2023
     */
    @Override
    public Clazz getClazzById(Long clazzId) {
        return clazzRepository.getClazzById(clazzId);
    }


    /**
     * Create by : HoangNM
     * Date create: 27/02/2023
     */
    @Override
    public List<Clazz> getAll() {
        return clazzRepository.getAll();
    }
}
