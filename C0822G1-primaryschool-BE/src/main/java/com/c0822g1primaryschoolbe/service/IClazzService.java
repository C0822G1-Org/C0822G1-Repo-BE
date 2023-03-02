package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.ClazzStudentDto;
import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IClazzService {

    /**
     * Create by : TuanNDN
     * @return
     */
    Page<Clazz> findAllClazz(Pageable pageable, @Param("keySearch1") String keySearch1);

    /**
     * Create by : TuanNDN
     * @return
     */
    Clazz findByIdClazz(@Param("clazzId") Long clazzId);

    /**
     * Create by : TuanNDN
     * @return
     */
    void updateClazz(Clazz clazz);

    /** Method use: createChooseClass()
     * Created date: 27/02/2023
     * Function:showListAll
     * Parameter: contentClass
     * Author: DungND
     * */
    List<Clazz> showListAll();

    /** Method use: createChooseClass()
     * Created date: 27/02/2023
     * Function:createChooseClass
     * Parameter: contentClass
     * Author: DungND
     * */
    void createChooseClass(Clazz clazz);
    /**
     * create by : DungND
     * Data create: 27/02/2023
     * funcion: showListClassStudentById()
     * @param 'id'
     */
    List<ClazzStudentDto> showListClassStudentById(@Param("id") long id);

    /**
     * Create by: NamHH
     * @return
     */
    List<Clazz> findAllClazz();
}
