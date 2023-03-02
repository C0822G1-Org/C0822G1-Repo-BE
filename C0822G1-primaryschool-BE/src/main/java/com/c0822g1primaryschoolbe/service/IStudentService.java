package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.student.IStudentInfo;
import com.c0822g1primaryschoolbe.dto.student.StudentListViewDto;
import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface IStudentService {

    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     */
    Page<IStudentInfo> getStudentList(Pageable pageable,int year, Long clazzId);

    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     */
    void removeStudent(Long id);

    /**
     * Create by : NuongHT
     * Date create: 27/02/2023
     */
    Student getStudentById(Long id);

    /**
     * Create by : HoangNM
     * Date create: 27/02/2023
     *
     */
    void create(Student student);

    /**
     * Create by : HoangNM
     * Date create: 27/02/2023
     */
    Student findId(long studentId);

    void update(Student student);
    /**
     * Created by: VanNTC
     * Date Created: 27/02/2023
     *  * Description: get student list of the class
     */
    Page<StudentListViewDto> showAllStudent(Long teacherId, Pageable pageable);
    /**
     * Create by : NuongHT
     * Date create: 27/02/2023
     *
     */
    Optional<Student> findById(Long id);

}
