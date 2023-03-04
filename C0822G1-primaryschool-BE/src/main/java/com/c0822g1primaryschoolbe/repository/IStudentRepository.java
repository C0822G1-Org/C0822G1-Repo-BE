package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student, Long> {

    /**
     * Create by TuanNDN
     * @return
     */
    @Query(value =
            "SELECT s.* " +
                    "FROM `primary-school-management`.student s " +
                    "join clazz  c on c.clazz_id = s.clazz_id " +
                    "where s.flag_delete = false ",
            countQuery =
                    "SELECT s.* " +
                            "FROM `primary-school-management`.student s " +
                            "join clazz  c on c.clazz_id = s.clazz_id " +
                            "where s.flag_delete = false ",
            nativeQuery = true)
    List<Student> showListStudent();



    @Query(value = "select * from student s where s.clazz_id = :clazzId", nativeQuery = true)
    List<Student> findAllStudentByClassId(@Param("clazzId") Integer clazzId);

    @Transactional
    @Modifying
    @Query(value =
            "UPDATE `student` " +
                    "set student.clazz_id = student.clazz_id +1 " +
                    "where student.student_id in :list", nativeQuery = true)
    void changeClazzId(@Param("list") List<Long> list);


    /**
     * Create by TuanNDN
     * @param idList
     * @return
     */
    @Query(value = "SELECT * " +
            "FROM `student` s " +
            "WHERE s.student_id IN :idList AND flag_delete = false ", nativeQuery = true)
    List<Student> findByListStudentId(@Param("idList") List<Long> idList);

    /**
     * Create by TuanNDN
     */
    @Transactional
    @Modifying
    @Query(value =
            "update student " +
                    "set student.clazz_id = student.clazz_id + 1 " +
                    "where student.student_id " +
                    "in (" +
                    "select p.student_id " +
                    "from point_management p " +
                    "where p.condition_check = false)", nativeQuery = true)
    void upClassNew();

    /**
     * Create by TuanNDN
     */
    @Transactional
    @Modifying
    @Query(value =
            "update point_management " +
                    "set point_management.condition_check = true " +
                    "where point_management.condition_check = false", nativeQuery = true)
    void lockUpClass();
}


