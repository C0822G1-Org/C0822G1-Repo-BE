package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.clazz.*;
import com.c0822g1primaryschoolbe.repository.IClazzRepository;
import com.c0822g1primaryschoolbe.service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzService implements IClazzService {
    @Autowired
    private IClazzRepository iClazzRepository;
    @Override
    public List<IClazzYear> getListYear() {
        return iClazzRepository.getListYear();
    }

    @Override
    public List<IClazzName> getListClazzName(int year, String name) {
        return iClazzRepository.getListClazzName(year,name);
    }

    @Override
    public IClazzTeacher getClazzTeacher(int year, Long clazzId) {
        return iClazzRepository.getClazzTeacher(year,clazzId);
    }

    @Override
    public void editTeacher(Long teacherId, Long clazzId) {
        iClazzRepository.editTeacher(teacherId,clazzId);
    }

    @Override
    public Clazz getClazzById(Long clazzId) {
        return iClazzRepository.getClazzById(clazzId);
    }


}
