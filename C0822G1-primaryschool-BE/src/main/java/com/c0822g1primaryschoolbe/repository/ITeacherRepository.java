package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.dto.teacher.TeacherViewDto;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, Long> {
    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take teacher by id Account
     * @param accountId
     * *return Teacher
     **/
    @Query(value = "select teacher.teacher_id as teacherId from teacher\n" +
            "where teacher.account_id=:accountId", nativeQuery = true, countQuery = "select teacher.teacher_id as teacherId from teacher\n" +
            "where teacher.account_id=:accountId")
    TeacherViewDto findIdTeacher(@Param("accountId") Long accountId);
}
