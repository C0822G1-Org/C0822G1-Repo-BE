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
    @Modifying
    @Query(value = "update teacher set teacher_name = :teacherName, date_of_birth = :dateOfBirth, gender = :gender, degree_id = :degreeId, teacher_type = :teacherType, id_card= :idCard, email = :email, phone_number = :phoneNumber where teacher_id= :teacherId", nativeQuery = true)
    void editInfoTeacher(@Param("teacherName") String teacherName,
                         @Param("dateOfBirth") String dateOfBirth,
                         @Param("gender") Boolean gender,
                         @Param("degreeId") Long degreeId,
                         @Param("teacherType") String teacherType,
                         @Param("idCard") String idCard,
                         @Param("email") String email,
                         @Param("phoneNumber") String phoneNumber,
                         @Param("teacherId") Long teacherId);
}
