package com.c0822g1primaryschoolbe.service.teacher.impl;
import com.c0822g1primaryschoolbe.repository.ITeacherRepository;
import com.c0822g1primaryschoolbe.service.teacher.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private ITeacherRepository iTeacherRepository;

    @Override
    public void editInfoTeacher(String email, String phoneNumber, String address, Long teacherId) {
        iTeacherRepository.editInfoTeacher(email, phoneNumber, address, teacherId);
    }

    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: editInfoTeacher
     */


}
