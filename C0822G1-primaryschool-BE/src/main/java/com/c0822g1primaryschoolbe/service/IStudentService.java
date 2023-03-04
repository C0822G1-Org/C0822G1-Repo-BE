package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentService {
    /**
     * Create by TuanNDN
     * @return
     */
    List<Student> showListStudent();

    /**
     * Create by TuanNDN
     * @param classId
     * @return
     */

    /**
     * Create by TuanNDN
     * @param classId
     * @return
     */
    List<Student> findAllStudentByClassId(Integer classId);

    /**
     * Create by TuanNDN
     * @param list
     */
    void changeClazzId(List<Long> list);

    /**
     * Create by TuanNDN
     * @param idList
     * @return
     */
    List<Student> findByListStudentId( List<Long> idList);

    /**
     * Create by TuanNDN
     */
    void upClassNew();

    /**
     * Create by TuanNDN
     */
    void lockUpClass();



}
