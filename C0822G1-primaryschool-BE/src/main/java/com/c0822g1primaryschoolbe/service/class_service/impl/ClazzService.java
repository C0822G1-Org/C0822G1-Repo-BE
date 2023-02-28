package com.c0822g1primaryschoolbe.service.class_service.impl;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.repository.IClazzRepository;
import com.c0822g1primaryschoolbe.service.class_service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzService implements IClazzService {

    @Autowired
    private IClazzRepository clazzRepository;
    @Override
    public List<Clazz> findAllClazz() {
        return clazzRepository.findAllClazz();
    }
}
