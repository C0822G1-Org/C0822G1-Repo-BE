package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.ClazzStudentDto;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.time_table_subject.IClazz;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IClazzService {

    /**
     * Create by TuanNDN
     * @param pageable
     * @param keySearch1
     * @return
     */
    Page<Clazz> findAllClazz(Pageable pageable, @Param("keySearch1") String keySearch1);

    /**
     * Create by TuanNDN
     * @param clazzId
     * @return
     */
    Clazz findByIdClazz(@Param("clazzId") Long clazzId);

    /**
     * Create by TuanNDN
     * @param clazz
     */
    void updateClazz(Clazz clazz);

    /**
     * Create by TuanNDN
     */
    void upBlockNew();

    /** Method use: createChooseClass()
     * Created date: 27/02/2023
     * Function:showListAll
     * Parameter: contentClass
     * Author: DungND
     */
    List<Clazz> showListAll();

    /**
     * Method use: createChooseClass()
     * Created date: 27/02/2023
     * Function:createChooseClass
     * Parameter: contentClass
     * Author: DungND
     */
    void createChooseClass(Clazz clazz);

    /**
     * create by : DungND
     * Data create: 27/02/2023
     * funcion: showListClassStudentById()
     *
     * @param 'id'
     */
    List<ClazzStudentDto> showListClassStudentById(@Param("id") long id);

    /**
     * Create by: NamHH
     * Data create: 27/02/2023
     * funcion: getAllClass
     * @return
     * @Param id_block
     */

    List<IClazz> showListClazz(Long bockId);

    /**
     * Create by: NamHH
     * Data create: 28/02/2023
     * funcion: getClass
     *
     * @return
     * @Param id_clazz
     */
    IClazz showClazz(Long clazzId);
}
