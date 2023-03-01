package com.c0822g1primaryschoolbe.service;
import com.c0822g1primaryschoolbe.dto.ClazzStudentDto;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IClassService {
    void createChooseClass(Clazz clazz);
    List<ClazzStudentDto> showListClassStudentById(@Param("id") long id);

}
