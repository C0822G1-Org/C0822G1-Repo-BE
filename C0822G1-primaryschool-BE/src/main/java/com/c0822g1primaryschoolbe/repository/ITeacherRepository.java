package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ITeacherRepository extends JpaRepository<Teacher, Long> {

    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: editInfoTeacher
     */

    @Modifying
    @Query(value = "update teacher set email = :email, phone_number = :phoneNumber, address = :address where teacher_id= :teacherId", nativeQuery = true)
    void editInfoTeacher(@Param("email") String email,
                         @Param("phoneNumber") String phoneNumber,
                         @Param("address") String address,
                         @Param("teacherId") Long teacherId);
}
