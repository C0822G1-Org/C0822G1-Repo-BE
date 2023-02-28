package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.dto.student.StudentListViewDto;
import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IStudentRepository extends JpaRepository<Student, Long> {

    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take student list by id teacher
     *
     * @param pageable
     * @return Page<StudentListViewDto>
     */

    @Query(value = "select student.student_id as studentId, student.student_name as studentName, student.gender as gender, student.date_of_birth as dateOfBirth\n" +
            "from student \n" +
            "join clazz on student.clazz_id = clazz.clazz_id\n" +
            "join teacher on clazz.teacher_id = teacher.teacher_id\n" +
            "where teacher.teacher_id= :teacherId and student.flag_delete = false\n" +
            "order by student.student_name", nativeQuery = true, countQuery = "select select student.student_id as studentId, student.student_name as studentName, student.gender as gender, student.date_of_birth as dateOfBirth\n" +
            "from student \n" +
            "join clazz on student.clazz_id = clazz.clazz_id\n" +
            "join teacher on clazz.teacher_id = teacher.teacher_id\n" +
            "where teacher.teacher_id=:teacherId and student.flag_delete = false\n" +
            "order by student.student_name")
    Page<StudentListViewDto> showAllStudent(@Param("teacherId") Long teacherId, Pageable pageable);


    /**
     * Create by : HoangNM
     * Date create: 27/02/2023
     * Description: create student
     *
     */

    @Modifying
    @Query(value = " insert into student( img, student_name, date_of_birth, gender,father_name, phone_number_father, father_job, mother_name, phone_number_mother, mother_job, religion, address, student_status, clazz_id, flag_delete) " +
            "values (:#{#student.img}, :#{#student.studentName},:#{#student.dateOfBirth},:#{#student.gender},:#{#student.fatherName},:#{#student.phoneNumberFather},:#{#student.fatherJob},:#{#student.motherName},:#{#student.phoneNumberMother},:#{#student.motherJob},:#{#student.religion},:#{#student.address},false, :#{#student.clazz.clazzId},false )", nativeQuery = true)
    void createStudent(@Param("student") Student student);


    /**
     * Create by : HoangNM
     * Date create: 27/02/2023
     * Description: find student by id
     *
     */



    @Query(value = "select * from `primary-school-management`.student where student_id=:studentId", nativeQuery = true, countQuery = "select * from `primary-school-management`.student where student_id=:studentId")
    Student findId(@Param("studentId") Long studentId);

    /**
     * Create by : HoangNM
     * Date create: 27/02/2023
     * Description: update student
     *
     */

    @Modifying
    @Query(value = "update student set img =:#{#student.img}, student_name=:#{#student.studentName}, date_of_birth=:#{#student.dateOfBirth}, gender:=#{#student.gender}, father_name=:#{#student.fatherName},phone_number_father=:#{#student.phoneNumberFather}, father_job=:#{#student.fatherJob}, mother_name=:#{#student.motherName}, phone_number_mother=:#{#student.phoneNumberMother}, mother_job=:#{#student.motherJob}, religion= :#{#student.religion}, address=:#{#student.address},student_status=false ,clazz_id= :#{#student.clazz.clazzId},flag_delete=false where student_id= :#{#student.studentId} ", nativeQuery = true)
    void updateStudent(@Param("student") Student student);}

