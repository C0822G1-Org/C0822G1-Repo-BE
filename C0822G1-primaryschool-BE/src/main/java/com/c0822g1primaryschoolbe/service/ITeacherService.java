package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.dto.teacher.ITeacherDto;
import com.c0822g1primaryschoolbe.dto.teacher.TeacherViewDto;
import com.c0822g1primaryschoolbe.entity.teacher.ITeacherInfo;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;

import java.util.List;

public interface ITeacherService {
    List<ITeacherInfo> getListNameTeacher(int year);

    ITeacherInfo getNameTeacher(String idCard,int year);


    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: editInfoTeacher
     */

    void editInfoTeacher(String email, String phoneNumber, String address, Long teacherId);

    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take teacher by id Account
     * @param accountId
     * *return Teacher
     **/
    TeacherViewDto findIdTeacher(Long accountId);



    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: findByTeacher
     */
    ITeacherDto findByTeacherDto(Long teacherId);

}
