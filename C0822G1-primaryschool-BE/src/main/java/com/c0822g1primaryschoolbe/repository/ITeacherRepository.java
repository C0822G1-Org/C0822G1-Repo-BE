package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ITeacherRepository extends JpaRepository<Teacher, Long> {

    @Query(value ="SELECT * from teacher where teacher_id = :teacherId and flag_delete = false",
            nativeQuery = true)
    Optional<Teacher> findByIdTeacher(@Param("teacherId") Long teacherId);


    @Query(value = "SELECT * FROM `primary-school-management`.teacher"
            ,countQuery = "SELECT * FROM `primary-school-management`.teacher"
            ,nativeQuery = true)
    List<Teacher> showListTeacher();
}
