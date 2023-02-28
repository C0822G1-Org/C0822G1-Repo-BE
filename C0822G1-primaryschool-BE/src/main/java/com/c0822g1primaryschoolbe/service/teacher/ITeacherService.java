package com.c0822g1primaryschoolbe.service.teacher;

import com.c0822g1primaryschoolbe.entity.teacher.Teacher;

public interface ITeacherService {

    void editInfoTeacher(String teacherName, String dateOfBirth, Boolean gender, Long degreeId, String teacherType, String idCard, String email, String phoneNumber, Long teacherId);
}
