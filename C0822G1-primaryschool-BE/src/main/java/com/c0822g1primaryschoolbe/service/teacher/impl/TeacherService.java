package com.c0822g1primaryschoolbe.service.teacher.impl;
import com.c0822g1primaryschoolbe.dto.ITeacherDto;
import com.c0822g1primaryschoolbe.dto.TeacherDtoToSearch;
import com.c0822g1primaryschoolbe.repository.ITeacherRepository;
import com.c0822g1primaryschoolbe.repository.TeacherRepository;
import com.c0822g1primaryschoolbe.service.teacher.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private ITeacherRepository iTeacherRepository;

    @Autowired
    private TeacherRepository teacherRepository;


    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: editInfoTeacher
     */

    @Override
    public void editInfoTeacher(String teacherName, String dateOfBirth, Boolean gender, Long degreeId, String teacherType, String idCard, String email, String phoneNumber, Long teacherId) {
        iTeacherRepository.editInfoTeacher(teacherName, dateOfBirth, gender, degreeId, teacherType, idCard, email, phoneNumber, teacherId);
    }


    /**
     * create by : VinhLD
     * date create 27/02/2023
     * function: search teacher by name and status
     * @param teacherDtoToSearch
     * @param pageable
     * @return
     */
    @Override
    public Page<ITeacherDto> searchTeacher(TeacherDtoToSearch teacherDtoToSearch, Pageable pageable) {
        return teacherRepository.searchTeacher(teacherDtoToSearch, pageable);
    }
}
