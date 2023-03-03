package com.c0822g1primaryschoolbe.service.impl;


import com.c0822g1primaryschoolbe.dto.ITeacherDto;
import com.c0822g1primaryschoolbe.dto.TeacherDtoToSearch;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import com.c0822g1primaryschoolbe.repository.TeacherRepository;
import com.c0822g1primaryschoolbe.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements ITeacherService {


    @Autowired
    private TeacherRepository teacherRepository;


    @Override
    public Page<Teacher> findByName(String name, Boolean status, Pageable pageable) {
        return teacherRepository.findByName(name,status, pageable);

    }


    /**
     * create by : VinhLD
     * date create 27/02/2023
     * function: search teacher by name and status
     * @param teacherDtoToSearch
     * @param pageable
     * @return
     */
    @Override
    public Page<ITeacherDto> searchTeacher(TeacherDtoToSearch teacherDtoToSearch, Pageable pageable) {
        return teacherRepository.searchTeacher(teacherDtoToSearch, pageable);
    }


}
