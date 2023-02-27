package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.repository.IClazzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ClazzService implements IClazzService {

    @Autowired
    private IClazzRepository clazzRepository;

    @Override
    public Page<Clazz> findAllClazz(Pageable pageable, String keySearch1) {
        return clazzRepository.findAllClazz(pageable, keySearch1);
    }

    @Override
    public Clazz findByIdClazz(Long idClazz) {
        return clazzRepository.findById(idClazz).get();
    }

    @Override
    public void updateClazz(Clazz clazz, Long id) {
        clazzRepository.updateClazz(clazz, id);
    }


}
