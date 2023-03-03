package com.c0822g1primaryschoolbe.repository;
import com.c0822g1primaryschoolbe.entity.ClazzStudentDto;
import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IClazzRepository extends JpaRepository<Clazz, Long> {
    @Transactional
    @Modifying
    @Query(value = "select * from clazz",countQuery = "select * from clazz", nativeQuery = true)
    List<Clazz> findAllClazz();


    /* Ngô Đình Nhật Tuấn*/
    @Query(value =
            " select c.*" +
                    " from `clazz` c " +
                    "join `teacher` t on t.teacher_id = c.teacher_id " +
                    "join `block` b on b.block_id = c.block_id " +
                    "join `student` s on s.clazz_id = c.clazz_id " +
                    "where c.clazz_name like concat('%', :keySearch1 ,'%') " +
                    "and c.flag_delete=false " +
                    "order by c.clazz_id desc",
            countQuery =
                    " select c.*" +
                            " from `clazz` c " +
                            "join `teacher` t on t.teacher_id = c.teacher_id " +
                            "join `block` b on b.block_id = c.block_id " +
                            "join `student` s on s.clazz_id = c.clazz_id " +
                            "where c.clazz_name like concat('%', :keySearch1 ,'%') " +
                            "and c.flag_delete=false " +
                            "order by c.clazz_id desc ",
            nativeQuery = true)
    Page<Clazz> findAllClazz(Pageable pageable, @Param("keySearch1") String keySearch1);

    /* Ngô Đình Nhật Tuấn*/
    @Query(value ="SELECT * from clazz where clazz_id = :clazzId and flag_delete = false",
            countQuery = "SELECT * from clazz where clazz_id = :clazzId and flag_delete = false",
            nativeQuery = true)
    Clazz findByIdClazz(@Param("clazzId") Long clazzId);



    /* Ngô Đình Nhật Tuấn*/
    @Transactional
    @Modifying
    @Query(value =
            "UPDATE clazz c SET c.teacher_id = :teacherId, " +
                    "c.clazz_name = :clazzName, " +
                    "c.flag_delete = :flagDelete, " +
                    "c.school_year = :schoolYear, " +
                    "c.year = :year," +
                    "c.block_id =:blockId " +
                    "WHERE c.clazz_id = :clazzId" ,

            nativeQuery = true)
    void updateClazz(
                     @Param("clazzId") Long clazzId,
                     @Param("teacherId") Long teacherId,
                     @Param("clazzName") String clazzName,
                     @Param("flagDelete") Boolean flagDelete,
                     @Param("schoolYear") String schoolYear,
                     @Param("year") Integer year,
                     @Param("blockId") Long blockId);



    /** Method use: createChooseClass()
     * Created date: 27/02/2023
     * Function:createChooseClass
     * Parameter: contentClass
     * Author: DungND
     * */
    @Transactional
    @Modifying
    @Query(value = "insert into `clazz` (clazz_name,school_year,block_id,teacher_id,flag_delete,year)VALUES(:clazzName,:schoolYear,:blockId,:teacherId,false,:year)"
            ,countQuery = "insert into `clazz` (clazz_name,school_year,block_id,teacher_id,flag_delete,year)VALUES(:clazzName,:schoolYear,:blockId,:teacherId,false,:year)"
            ,nativeQuery = true)
    void createChooseClass(@Param("clazzName") String clazzName,@Param("schoolYear") String schoolYear, @Param("blockId") Block blockId, @Param("teacherId") Teacher teacherId,@Param("year") Integer year);
    /**
     * create by : DungND
     * Data create: 27/02/2023
     * funcion: showListClassStudentById()
     * @param 'id'
     */
    @Query(value = "SELECT `clazz`.clazz_id as clazzId,`clazz`.clazz_name as clazzName,`teacher`.teacher_id as teacherId,`teacher`.teacher_name as teacherName,`student`.student_id as studentId," +
            "`student`.student_name as studentName,`student`.date_of_birth as dateOfBirth,`student`.gender as gender,student.address as address FROM  `clazz` left join `student`  on `clazz`.clazz_id= `student`.clazz_id left join `teacher` on `clazz`.teacher_id = `teacher`.teacher_id  where `clazz`.clazz_id= :id"
            ,countQuery = "SELECT `clazz`.clazz_id as clazzId,`clazz`.clazz_name as clazzName,`teacher`.teacher_id as teacherId,`teacher`.teacher_name as teacherName,`student`.student_id as studentId," +
            "`student`.student_name as studentName,`student`.date_of_birth as dateOfBirth,`student`.gender as gender,`student`.address as address FROM  `clazz` left join `student`  on `clazz`.clazz_id= `student`.clazz_id left join `teacher` on `clazz`.teacher_id = `teacher`.teacher_id  where `clazz`.clazz_id= :id"
            ,nativeQuery = true)
    List<ClazzStudentDto> showListClassStudentById(@Param("id") long id);
    /**
     * create by : DungND
     * Data create: 27/02/2023
     * funcion: showListClass()
     */
    @Query(value = "SELECT * FROM `clazz`"
            ,nativeQuery = true)
    List<Clazz> showListAll();
}
