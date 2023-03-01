package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.dto.TeacherDto;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;


import java.util.List;

public interface ITeacherService {
    List<Teacher> showListTeacher();
}
