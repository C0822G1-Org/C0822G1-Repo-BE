package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface IClassRepository extends JpaRepository<Clazz,Long> {

    /** Method use: createChooseClass()
     * Get List data of required attributes from the database
     * Parameter: name_class,id_teacher,id_block
     * Author: DungND
     * */
    @Transactional
    @Modifying
    @Query(value = "insert into c0_8.clazz (name_class,id_teacher,id_block)VALUES(:nameClass,:idTeacher,:idBlock)"
            ,countQuery = "insert into c0_8.clazz (name_class,id_teacher,id_block)VALUES(:nameClass,:idTeacher,:idBlock)"
            ,nativeQuery = true)
    void createChooseClass(@Param("nameClass") String nameClass, @Param("idTeacher") Teacher idTeacher, @Param("idBlock") Block idBlock);
}
