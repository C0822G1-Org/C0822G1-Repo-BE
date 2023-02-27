package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IClassRepository extends JpaRepository<Clazz,Long> {

    /** Method use: createChooseClass()
     * Created date: 27/02/2023
     * Function:createChooseClass
     * Parameter: contentClass
     * Author: DungND
     * */
    @Transactional
    @Modifying
        @Query(value = "insert into `primary-school-management`.clazz (clazz_name,school_year,block_id,teacher_id,flag_delete)VALUES(:clazzName,:schoolYear,:blockId,:teacherId,false)"
            ,countQuery = "insert into `primary-school-management`.clazz (clazz_name,school_year,block_id,teacher_id,flag_delete)VALUES(:clazzName,:schoolYear,:blockId,:teacherId,false"
            ,nativeQuery = true)
    void createChooseClass(@Param("clazzName") String clazzName,@Param("schoolYear") String schoolYear, @Param("blockId") Block blockId, @Param("teacherId") Teacher teacherId);


    /**
     * create by : DungND
     * Data create: 27/02/2023
     * funcion: findByIdClass()
     * @param 'id'
     */
    @Query(value = "SELECT * FROM `primary-school-management`.clazz  where clazz_id = :id"
            ,countQuery = "SELECT * FROM `primary-school-management`.clazz"
            ,nativeQuery = true)
    List<Clazz> findByIdClass(@Param("id") long id);

}
