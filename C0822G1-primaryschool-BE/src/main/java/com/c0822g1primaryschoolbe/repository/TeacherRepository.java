package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
@Query(value = "select teacher.* from teacher where teacher.teacher_name like %:name% and teacher.teacher_status = :status order by teacher.teacher_name asc ",nativeQuery = true)
Page<Teacher> findByName(@Param("name") String name,
                         @Param("status") Boolean status,
                         Pageable pageable);


}
