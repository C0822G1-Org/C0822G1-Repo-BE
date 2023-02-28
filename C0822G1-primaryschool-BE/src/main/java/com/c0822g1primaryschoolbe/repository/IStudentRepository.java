package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Repository
@Transactional
public interface IStudentRepository extends JpaRepository<Student, Long> {
    @Modifying
    @Query(value = " insert into student( img, student_name, date_of_birth, gender,father_name, phone_number_father, father_job, mother_name, phone_number_mother, mother_job, religion, address, student_status, clazz_id, flag_delete) " +
            "values (:#{#student.img}, :#{#student.studentName},:#{#student.dateOfBirth},:#{#student.gender},:#{#student.fatherName},:#{#student.phoneNumberFather},:#{#student.fatherJob},:#{#student.motherName},:#{#student.phoneNumberMother},:#{#student.motherJob},:#{#student.religion},:#{#student.address},false, :#{#student.clazz.clazzId},false )", nativeQuery = true)
    void createStudent(@Param("student") Student student);





    @Query(value = "select * from student where student_id =:studentId", nativeQuery = true)
    Student findId(@Param("studentId") Long studentId);

    @Modifying
    @Query(value = "update student set img =:#{#student.img}, student_name=:#{#student.studentName}, date_of_birth=:#{#student.dateOfBirth}, gender:=#{#student.gender}, father_name=:#{#student.fatherName},phone_number_father=:#{#student.phoneNumberFather}, father_job=:#{#student.fatherJob}, mother_name=:#{#student.motherName}, phone_number_mother=:#{#student.phoneNumberMother}, mother_job=:#{#student.motherJob}, religion= :#{#student.religion}, address=:#{#student.address},student_status=false ,clazz_id= :#{#student.clazz.clazzId},flag_delete=false where student_id= :#{#student.studentId} ", nativeQuery = true)
    void updateStudent(@Param("student") Student student);
}


