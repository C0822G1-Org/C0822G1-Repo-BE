package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.dto.IStudentDto;
import com.c0822g1primaryschoolbe.dto.StudentDtoToSearch;
import com.c0822g1primaryschoolbe.entity.student.IStudentInfo;
import com.c0822g1primaryschoolbe.dto.student.StudentListViewDto;
import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import javax.transaction.Transactional;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Long> {

    /**
     * Create by:TrungNQ
     * Date create:27/2/2023
     * Funciton: get List Student by Param
     *
     * @param year,
     * @param clazzId
     * @param pageable
     * @return page student
     */
    @Transactional
    @Query(value = "select s.student_id as id,s.student_name as name,s.address as address,s.date_of_birth as dateOfBirth from student s join clazz c on c.clazz_id = s.clazz_id where c.year= :year and c.clazz_id= :clazzId and s.flag_delete=true",
    countQuery = " select s.student_id as id,s.student_name as name,s.address as address,s.date_of_birth as dateOfBirth from student s join clazz c on c.clazz_id = s.clazz_id where c.year= :year and c.clazz_id= :clazzId and s.flag_delete=true", nativeQuery = true)
    Page<IStudentInfo> getStudentList(Pageable pageable, @Param("year") int year, @Param("clazzId") Long clazzId);


    /**
     * Create by:TrungNQ
     * Date create:27/2/2023
     * Funciton: delete student by id
     * @param id
     */
    @Transactional
    @Modifying
    @Query(value = "update student set flag_delete=false where student_id = :id", nativeQuery = true)
    void removeStudent(@Param("id") Long id);


    /**
     * Create by:NuongHT
     * Date create:28/2/2023
     * Funciton: get info student by id
     * @param id
     */
    @Query(value = "select * from student where student_id = :id", nativeQuery = true)
    Student getStudentById(@Param("id") Long id);


    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take student list by id teacher
     *
     * @param pageable
     * @return Page<StudentListViewDto>
     */

    @Query(value = "select `student`.student_id as studentId, `student`.student_name as studentName, `student`.gender as gender,"  +
            " `student`.date_of_birth as dateOfBirth, `clazz`.clazz_name as nameClazz " +
            "from `student` " +
            "join `clazz` on `student`.clazz_id = `clazz`.clazz_id " +
            "join `teacher` on `clazz`.teacher_id = `teacher`.teacher_id " +
            "where `teacher`.teacher_id= :teacherId and `student`.flag_delete = false " +
            "order by `student`.student_name ", nativeQuery = true)
    Page<StudentListViewDto> showAllStudent(@Param("teacherId") Long teacherId, Pageable pageable);

    /**
     * Create by : NuongHT
     * Date create: 28/02/2023
     * Description: create query get student by ID
     *
     * @param 'id'
     * @return student
     */
    @Query(value = "select s.* from student as s where s.student_id= :id and s.flag_delete = false", nativeQuery = true)
    Optional<Student> findById(@Param("id") Long id);

    /**
     * Create by : HoangNM
     * Date create: 27/02/2023
     * Description: create student
     *
     */

    @Modifying
    @Query(value = " insert into student( " +
            "img, " +
            "student_name, " +
            "date_of_birth, " +
            "gender," +
            "father_name, " +
            "phone_number_father, " +
            "father_job, " +
            "mother_name, " +
            "phone_number_mother, " +
            "mother_job, " +
            "religion, " +
            "address, " +
            "student_status, " +
            "clazz_id, " +
            "flag_delete) " +
            "values (:#{#student.img}," +
            " :#{#student.studentName}," +
            ":#{#student.dateOfBirth}," +
            ":#{#student.gender}," +
            ":#{#student.fatherName}," +
            ":#{#student.phoneNumberFather}," +
            ":#{#student.fatherJob}," +
            ":#{#student.motherName}," +
            ":#{#student.phoneNumberMother}," +
            ":#{#student.motherJob}," +
            ":#{#student.religion}," +
            ":#{#student.address},false, " +
            ":#{#student.clazz.clazzId},false )", nativeQuery = true)
    void createStudent(@Param("student") Student student);


    /**
     * Create by : HoangNM
     * Date create: 27/02/2023
     * Description: find student by id
     *
     */



    @Query(value = "select * from `primary-school-management`.student where student.student_id = :studentId", nativeQuery = true, countQuery = "select * from `primary-school-management`.student where student_id=:studentId")
    Student findId(@Param("studentId") Long studentId);

    /**
     * Create by : HoangNM
     * Date create: 27/02/2023
     * Description: update student
     *
     */

    @Modifying
    @Query(value = "update student set img =:#{#student.img}," +
            " student_name=:#{#student.studentName}," +
            " date_of_birth=:#{#student.dateOfBirth}," +
            " gender=:#{#student.gender}," +
            "father_name=:#{#student.fatherName}," +
            "phone_number_father=:#{#student.phoneNumberFather}," +
            "father_job=:#{#student.fatherJob}," +
            " mother_name=:#{#student.motherName}," +
            "phone_number_mother=:#{#student.phoneNumberMother}," +
            " mother_job=:#{#student.motherJob}," +
            "religion= :#{#student.religion}," +
            "address=:#{#student.address}," +
            "student_status=false," +
            "clazz_id= :#{#student.clazz.clazzId}," +
            "flag_delete=false where student_id= :#{#student.studentId}", nativeQuery = true)
    void updateStudent(@Param("student") Student student);

    /**
     * create by :VinhLD
     * date create 27/02/2023
     *
     * funtion : search student by name and status
     *
     * @param "name"
     * @return
     */
    @Query(value = " SELECT student.*, `clazz`.`clazz_name` as studentClazz, ((`point_management`.semester_one + `point_management`.semester_two*2)/3) as studentPoint from student LEFT JOIN clazz on student.clazz_id = clazz.clazz_id LEFT JOIN point_management on student.`student_id` = point_management.`student_id` WHERE student.student_name like %:name% and student.student_status =:status ORDER BY student.student_name ASC", nativeQuery = true,
            countQuery = " SELECT student.*, clazz.clazz_name as studentClazz, ((point_management.semester_one + point_management.semester_two*2)/3) as studentPoint from student LEFT JOIN clazz on student.clazz_id = clazz.clazz_id LEFT JOIN point_management on student.`student_id` = point_management.`student_id` WHERE student.student_name like %:name% and student.student_status =:status ORDER BY student.student_name ASC")
    Page<Student> findByName(@Param("name") String name,
                             @Param("status") String status,
                             Pageable pageable);


    @Query(value = "select `student`.student_name as nameStudent, " +
            "`student`.student_id as idStudent, " +
            "`student`.date_of_birth as dateOfBirthStudent, " +
            "clazz.clazz_name as nameClazz, " +
            "((point_management.semester_one+point_management.semester_two*2)/3) as studentPoint " +
            "from student left join clazz on `student`.clazz_id = clazz.clazz_id " +
            "left join point_management on student.student_id= point_management.student_id " +
            "where student.student_name like %:name% and student.student_status = :status " +
            "order by student.student_name asc",
            countQuery = "select * from (select `student`.student_name as nameStudent, \n" +
                    "            `student`.student_id as idStudent, \n" +
                    "            `student`.date_of_birth as dateOfBirthStudent, \n" +
                    "            clazz.clazz_name as nameClazz, \n" +
                    "            ((point_management.semester_one+point_management.semester_two*2)/3) as studentPoint \n" +
                    "            from student left join clazz on `student`.clazz_id = clazz.clazz_id \n" +
                    "            left join point_management on student.student_id= point_management.student_id \n" +
                    "            where student.student_name like %:name% and student.student_status = :status \n" +
                    "            order by student.student_name asc) as newView;", nativeQuery = true)
    Page<IStudentDto> findByNameAndStatus(@Param("name") String name,
                                          @Param("status") Boolean status,
                                          Pageable pageable);


    /**
     * create by :VinhLD
     * date create 27/02/2023
     *funtion : search student by name and status
     * @param "name, status"
     * @return
     */
    @Query(value = "select `student`.student_name as nameStudent, " +
            " `student`.student_id as idStudent, " +
            " `student`.date_of_birth as dateOfBirthStudent, " +
            " `clazz`.clazz_name as nameClazz, " +
            " ((point_management.semester_one+point_management.semester_two*2)/3) as studentPoint " +
            " from `student` left join clazz on `student`.clazz_id = `clazz`.clazz_id " +
            " left join point_management on `student`.student_id = point_management.student_id " +
            " where `student`.student_name like %:#{#studentDtoToSearch.nameStudent}% " +
            " and `student`.student_status = :#{#studentDtoToSearch.studyStatus} " +
            " order by `student`.student_name asc", nativeQuery = true)
    Page<IStudentDto> searchStudent(@Param("studentDtoToSearch") StudentDtoToSearch studentDtoToSearch, Pageable pageable);
}
