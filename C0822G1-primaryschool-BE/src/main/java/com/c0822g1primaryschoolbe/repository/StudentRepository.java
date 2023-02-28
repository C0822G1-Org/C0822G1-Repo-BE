package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface StudentRepository extends JpaRepository<Student,Long> {
//
//    @Query(value = "select `student`.student_name as studentName ,`student`.student_id as idStudent, `student`.date_of_birth as dateOfBirthStudent, `clazz`.clazz_name as studentClazz, ((point_management.semester_one+point_management.semester_two*2)/3) as studentPoint from student left join clazz" +
//            " on student.clazz_id = clazz.clazz_id left join point_management on student.student_id= point_management.student_id where student.student_name like %:name% and student.student_status = :status order by student.student_name asc", nativeQuery = true)
//    Page<Student> findByName(@Param("name") String name,
//                             @Param("status") String status,
//                             Pageable pageable);
    /**
     * create by :VinhLD
     * date create 27/02/2023
     *
     * funtion : search student by name and status
     * @param "name"
     *
     * @return
     */




    @Query(value = " SELECT student.*, `clazz`.`clazz_name` as studentClazz, ((`point_management`.semester_one + `point_management`.semester_two*2)/3) as studentPoint from student LEFT JOIN clazz on student.clazz_id = clazz.clazz_id LEFT JOIN point_management on student.`student_id` = point_management.`student_id` WHERE student.student_name like %:name% and student.student_status =:status ORDER BY student.student_name ASC", nativeQuery = true,
    countQuery = " SELECT student.*, clazz.clazz_name as studentClazz, ((point_management.semester_one + point_management.semester_two*2)/3) as studentPoint from student LEFT JOIN clazz on student.clazz_id = clazz.clazz_id LEFT JOIN point_management on student.`student_id` = point_management.`student_id` WHERE student.student_name like %:name% and student.student_status =:status ORDER BY student.student_name ASC")
    Page<Student> findByName(@Param("name") String name,
                             @Param("status") String status,
                             Pageable pageable);




}
