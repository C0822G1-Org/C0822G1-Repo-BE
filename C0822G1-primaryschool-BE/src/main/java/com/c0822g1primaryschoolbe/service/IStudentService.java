package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.student.IStudentInfo;
import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStudentService {
    Page<IStudentInfo> getStudentList(Pageable pageable,int year, Long clazzId);
    void removeStudent(Long id);
    Student getStudentById(Long id);
}
