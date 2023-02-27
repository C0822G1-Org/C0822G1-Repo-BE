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
    @Query(value = "insert into student( img, name_student, date_of_birth, gender,name_father, phone_number_father, job_father, name_mother, phone_number_mother, job_mother, religion, address, clazz_id) " +
            "values ( :img,:studentName,:dateOfBirth,:gender,:fatherName,:phoneNumberFather,:fatherJob,:motherName,:phoneNumberMother,:motherJob,:religion,:address,:clazzId)", nativeQuery = true)
    void createStudent(@Param("img") String img,
                       @Param("studentName") String studentName,
                       @Param("dateOfBirth") String dateOfBirth,
                       @Param("gender") Boolean gender,
                       @Param("fatherName") String fatherName,
                       @Param("phoneNumberFather") String phoneNumberFather,
                       @Param("fatherJob") String fatherJob,
                       @Param("motherName") String motherName,
                       @Param("phoneNumberMother") String phoneNumberMother,
                       @Param("motherJob") String motherJob,
                       @Param("religion") String religion,
                       @Param("address") String address,
                       @Param("clazzId") long clazzId
    );


    @Query(value = "select * from student where id =:id", nativeQuery = true)
    Student findId(@Param("id") long id);

    @Modifying
    @Query(value = "update student set img=:img,date_of_birth =:dateOfBirth,gender=:gender,name_father=:fatherName,phone_number_father=:phoneNumberFather,job_father=:fatherJob,name_mother=:motherName,phone_number_mother=:phoneNumberMother,job_mother=:motherJob,religion=:religion,address=:address,clazz_id=:clazzId", nativeQuery = true)
    void updateStudent(@Param("img") String img,
                       @Param("studentName") String studentName,
                       @Param("dateOfBirth") String dateOfBirth,
                       @Param("gender") Boolean gender,
                       @Param("fatherName") String fatherName,
                       @Param("phoneNumberFather") String phoneNumberFather,
                       @Param("fatherJob") String fatherJob,
                       @Param("motherName") String motherName,
                       @Param("phoneNumberMother") String phoneNumberMother,
                       @Param("motherJob") String motherJob,
                       @Param("religion") String religion,
                       @Param("address") String address,
                       @Param("clazzId") long clazzId
    );
}
