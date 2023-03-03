package com.c0822g1primaryschoolbe.service.teacher;

import com.c0822g1primaryschoolbe.entity.teacher.Teacher;

public interface ITeacherService {

    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: editInfoTeacher
     */

    void editInfoTeacher(String email, String phoneNumber, String address, Long teacherId);
}
