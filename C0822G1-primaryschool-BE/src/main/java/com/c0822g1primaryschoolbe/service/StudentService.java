package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    /**
     * Create by TuanNDN
     * @return
     */
    @Override
    public List<Student> showListStudent() {
        return studentRepository.showListStudent();
    }


    /**
     * Create by TuanNDN
     * @param classId
     * @return
     */
    @Override
    public List<Student> findAllStudentByClassId(Integer classId) {
        return this.studentRepository.findAllStudentByClassId(classId);
    }

    /**
     * Create by TuanNDN
     * @param list
     */
    @Override
    public void changeClazzId(List<Long> list) {
        studentRepository.changeClazzId(list);
    }

    /**
     * Create by TuanNDN
     * @param idList
     * @return
     */
    @Override
    public List<Student> findByListStudentId(List<Long> idList) {
        return studentRepository.findByListStudentId(idList);
    }

    /**
     * Create by TuanNDN
     */
    @Override
    public void upClassNew() {
        studentRepository.upClassNew();
    }

    /**
     * Create by TuanNDN
     */
    @Override
    public void lockUpClass() {
        studentRepository.lockUpClass();
    }



}
