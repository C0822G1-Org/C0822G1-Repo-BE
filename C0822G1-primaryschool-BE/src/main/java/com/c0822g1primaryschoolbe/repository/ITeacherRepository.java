package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.ITeacherDto;
import com.c0822g1primaryschoolbe.entity.TeacherDto;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ITeacherRepository extends JpaRepository<Teacher, Long> {
    /**
     * Create by : TuanNDN
     * @return
     */
    @Query(value ="SELECT * from teacher where teacher_id = :teacherId and flag_delete = false",
            nativeQuery = true)
    Optional<Teacher> findByIdTeacher(@Param("teacherId") Long teacherId);

    /**
     * Create by : TuanNDN
     * @return
     */
    @Query(value = "SELECT teacher.teacher_id as teacherId, teacher.teacher_name as teacherName FROM `teacher`",nativeQuery = true)
    List<ITeacherDto> showListTeacher();
}
