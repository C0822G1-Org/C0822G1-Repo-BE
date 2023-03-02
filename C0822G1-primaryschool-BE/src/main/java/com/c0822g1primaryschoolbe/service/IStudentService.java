package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.dto.IStudentDto;
import com.c0822g1primaryschoolbe.dto.StudentDtoToSearch;
import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentService {


    Page<Student> findByName(String name, String status, Pageable pageable);



    Page<IStudentDto> findByNameAndStatus(String name, Boolean status, Pageable pageable);

    Page<IStudentDto> searchStudent(StudentDtoToSearch studentDtoToSearch, Pageable pageable);
}
