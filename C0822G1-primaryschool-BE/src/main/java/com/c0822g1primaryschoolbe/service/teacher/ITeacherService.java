package com.c0822g1primaryschoolbe.service.teacher;

import com.c0822g1primaryschoolbe.dto.ITeacherDto;
import com.c0822g1primaryschoolbe.dto.TeacherDtoToSearch;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ITeacherService {

    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: editInfoTeacher
     */

    void editInfoTeacher(String teacherName, String dateOfBirth, Boolean gender, Long degreeId, String teacherType, String idCard, String email, String phoneNumber, Long teacherId);





    /**
     * create by : VinhLD
     * date create 27/02/2023
     * function : search  teacher by name and status
     *
     * @param teacherDtoToSearch
     * @param pageable
     * @return
     */
    Page<ITeacherDto> searchTeacher(TeacherDtoToSearch teacherDtoToSearch, Pageable pageable);

}
