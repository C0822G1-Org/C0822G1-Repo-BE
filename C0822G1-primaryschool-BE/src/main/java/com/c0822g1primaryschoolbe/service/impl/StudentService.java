package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.dto.student.StudentListViewDto;
import com.c0822g1primaryschoolbe.repository.IStudentRepository;
import com.c0822g1primaryschoolbe.service.student.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Page<StudentListViewDto> showAllStudent(Long teacherId, Pageable pageable) {
        return studentRepository.showAllStudent(teacherId, pageable);
    }
}
