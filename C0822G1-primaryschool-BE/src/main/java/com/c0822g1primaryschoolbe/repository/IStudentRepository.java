package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface IStudentRepository extends JpaRepository<Student,Long> {
    /**
     * Create by : NuongHT
     * Date create: 28/02/2023
     * Description: create query get student by ID
     * @param 'id'
     * @return student
     */
    @Query(value = "select s.* from student as s where s.student_id= :id and s.flag_delete = false",nativeQuery = true)
    Optional<Student> findById(@Param("id") Long id);
}
