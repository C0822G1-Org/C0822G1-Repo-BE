package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ITeacherService {

    Page<Teacher>findByName(String name, String status, Pageable pageable);

}
