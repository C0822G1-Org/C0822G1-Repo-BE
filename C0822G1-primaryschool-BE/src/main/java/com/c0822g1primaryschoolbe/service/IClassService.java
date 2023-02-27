package com.c0822g1primaryschoolbe.service;


import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IClassService {
    void createChooseClass(Clazz clazz);
    List<Clazz> findByIdClass(@Param("id") long id);

}
