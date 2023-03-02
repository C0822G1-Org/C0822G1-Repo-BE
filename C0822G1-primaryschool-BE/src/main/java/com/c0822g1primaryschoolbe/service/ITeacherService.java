package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.dto.TeacherDtoToSearch;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ITeacherService {

    Page<Teacher>findByName(String name, Boolean status, Pageable pageable);




    /**
     * create by :VinhLD
     * date create 27/02/2023
     *funtion : search teacher by name and status
     * @param "name, status"
     * @return
     */
    Page<Teacher>searchTeacher(TeacherDtoToSearch teacherDtoToSearch, Pageable pageable);



}
