package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.dto.student.StudentListViewDto;
import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentService {
    /**
     * Create by : HoangNM
     * Date create: 27/02/2023
     *
     */
    void create(Student student);


    Student findId(long studentId);

    void update(Student student);
    /**
     * Created by: VanNTC
     * Date Created: 27/02/2023
     *  * Description: get student list of the class
     */
    Page<StudentListViewDto> showAllStudent(Long teacherId, Pageable pageable);
}
