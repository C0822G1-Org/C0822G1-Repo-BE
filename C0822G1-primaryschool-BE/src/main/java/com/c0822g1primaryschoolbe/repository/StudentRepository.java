package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query(value = "select student.student_name as studentName , student.student_id as id, student.date_of_birth as dateOfBirthStudent, clazz.clazz_name as studentClazz, ((point_management.semesterOne+point_management.semesterTwo*2)/3) as studentPoint from student left join clazz" +
            " on student.clazz_id = clazz.clazz_id left join point_management on student.student_id= point_management.student_id where student.student_name like %:name% and student.student_status = :status group by student.student_id order by student.student_name asc", nativeQuery = true)
    Page<Student> findByName(@Param("name") String name,
                             @Param("status") String status,
                             Pageable pageable);


}
