package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.ITeacherDto;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.repository.query.Param;
import com.c0822g1primaryschoolbe.dto.teacher.TeacherViewDto;
import com.c0822g1primaryschoolbe.entity.teacher.ITeacherInfo;

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

    List<ITeacherDto> showListTeacher();

    List<ITeacherInfo> getListNameTeacher(int year);

    ITeacherInfo getNameTeacher(String idCard,int year);

    TeacherViewDto findIdTeacher(Long accountId);
}
