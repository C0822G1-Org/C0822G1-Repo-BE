package com.c0822g1primaryschoolbe.service.teacher;

import com.c0822g1primaryschoolbe.dto.teacher.TeacherViewDto;

public interface ITeacherService {
    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take teacher by id Account
     * @param accountId
     * *return Teacher
     **/
    TeacherViewDto findIdTeacher(Long accountId);
}
