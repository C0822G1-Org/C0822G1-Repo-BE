package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface IClazzService {

    Page<Clazz> findAllClazz(Pageable pageable, @Param("keySearch1") String keySearch1);

    Clazz findByIdClazz(@Param("clazzId") Long clazzId);
//    void updateClazz(Clazz clazz, Long clazzId);
    void updateClazz(Clazz clazz);

}
