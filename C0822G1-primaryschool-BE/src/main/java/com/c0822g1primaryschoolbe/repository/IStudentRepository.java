package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface IStudentRepository extends JpaRepository<Student,Long> {

    @Query(value = "select s.* from student as s where s.student_id= :id and s.flag_delete=false;",nativeQuery = true)
    Optional<Student> findById(@Param("id") Long id);

    @Query(value = "select s.* from student as s;",nativeQuery = true)
    List<Student> findAll();

}