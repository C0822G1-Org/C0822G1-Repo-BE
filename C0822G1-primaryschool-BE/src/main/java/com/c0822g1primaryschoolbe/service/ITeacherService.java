package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ITeacherService {
    /**
     * Create by TuanNDN
     * @param teacherId
     * @return
     */
    Optional<Teacher> findByIdTeacher(@Param("teacherId") Long teacherId);

    /**
     * Create by TuanNDN
     * @return
     */
    List<Teacher> showListTeacher();


}
