package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.student.IStudentInfo;
import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.repository.IStudentRepository;
import com.c0822g1primaryschoolbe.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository iStudentRepository;
//    @Override
//    public Page<IStudentInfo> getStudentList(Pageable pageable,int year, int clazzId) {
//        return iStudentRepository.getStudentList(pageable,year,clazzId);
//    }
//
    @Override
    public List<IStudentInfo> getStudentList(int year, Long clazzId) {
        return iStudentRepository.getStudentList(year,clazzId);
    }

    @Override
    public void deleteStudent(Long id) {
        iStudentRepository.removeStudentCus(id);
    }

    @Override
    public Student findStudentById(Long id) {
        return iStudentRepository.getStudentByID(id);
//        return null;
    }
}
