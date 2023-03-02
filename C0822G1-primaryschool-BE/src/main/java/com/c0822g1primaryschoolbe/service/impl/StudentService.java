package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.dto.student.StudentListViewDto;
import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.repository.IStudentRepository;
import com.c0822g1primaryschoolbe.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    /**
     * Create by : HoangNM
     * Date create: 27/02/2023
     */
    @Override
    public void create(Student student) {
        studentRepository.createStudent(student);
    }

    @Override
    public Student findId(long studentId) {
        return studentRepository.findId(studentId);
    }

    @Override
    public void update(Student student) {
        studentRepository.updateStudent(student);
    }

    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     *
     */

    @Override
    public Page<StudentListViewDto> showAllStudent(Long teacherId, Pageable pageable) {
        return studentRepository.showAllStudent(teacherId, pageable);

        /**
         * Create by : NuongHT
         * Date create: 28/02/2023
         * Description: repository call database
         *
    **/
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }


}