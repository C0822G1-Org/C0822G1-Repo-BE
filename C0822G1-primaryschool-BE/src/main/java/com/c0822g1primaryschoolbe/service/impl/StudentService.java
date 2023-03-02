package com.c0822g1primaryschoolbe.service.impl;


import com.c0822g1primaryschoolbe.dto.IStudentDto;
import com.c0822g1primaryschoolbe.dto.StudentDtoToSearch;
import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.repository.StudentRepository;
import com.c0822g1primaryschoolbe.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Page<Student> findByName(String name, String status, Pageable pageable) {
        return studentRepository.findByName(name, status, pageable);
    }

    @Override
    public Page<IStudentDto> findByNameAndStatus(String name, Boolean status, Pageable pageable) {
        return studentRepository.findByNameAndStatus(name, status, pageable);
    }




    /**
     * create by :VinhLD
     * date create 27/02/2023
     *funtion : search student by name and status
     * @param "name, status"
     * @return
     */
    @Override
    public Page<IStudentDto> searchStudent(StudentDtoToSearch studentDtoToSearch, Pageable pageable) {
        return studentRepository.searchStudent(studentDtoToSearch, pageable);
    }
}
