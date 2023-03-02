package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student, Long> {

    /**
     * Create by : TuanNDN
     * @return
     */
    @Query(value =
            "SELECT s.* " +
                    "FROM `primary-school-management`.student s " +
                    "join clazz  c on c.clazz_id = s.clazz_id " +
                    "where s.flag_delete = false ",
            countQuery =
                    "SELECT s.* " +
                            "FROM `primary-school-management`.student s " +
                            "join clazz  c on c.clazz_id = s.clazz_id " +
                            "where s.flag_delete = false ",
            nativeQuery = true)
    List<Student> showListStudent();

}
