package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.student.IStudentInfo;
import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer> {
    @Transactional
    @Query(value = "select s.student_id as id,s.student_name as name,s.address as address,s.date_of_birth as dateOfBirth from student s join clazz c on c.clazz_id = s.clazz_id where (c.year= :year and c.clazz_id= :clazzId and s.delete_flag=true); ",
    countQuery = "select s.student_id as id,s.student_name as name,s.address as address,s.date_of_birth as dateOfBirth from student s join clazz c on c.clazz_id = s.clazz_id where (c.year= :year and c.clazz_id= :clazzId and s.delete_flag=true);",nativeQuery = true)
    Page<IStudentInfo> getStudentList(Pageable pageable,@Param("year") int year, @Param("clazzId") int clazzId);
}
