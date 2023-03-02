package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.repository.IClazzRepository;
import com.c0822g1primaryschoolbe.service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzService implements IClazzService {
    @Autowired
    IClazzRepository clazzRepository;
    @Override
    public List<Clazz> getAll() {
        return clazzRepository.getAll();
    }
}