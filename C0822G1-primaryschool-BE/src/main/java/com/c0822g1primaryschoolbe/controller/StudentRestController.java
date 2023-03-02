package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.dto.student.StudentListViewDto;
import com.c0822g1primaryschoolbe.dto.teacher.TeacherViewDto;
import com.c0822g1primaryschoolbe.service.student.IStudentService;
import com.c0822g1primaryschoolbe.service.teacher.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentRestController {
    @Autowired
    private IStudentService studentService;

    @Autowired
    private ITeacherService teacherService;

    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take student list by id teacher
     *
     * @param pageable
     * @return
     */

    @GetMapping("/list-id-teacher/{teacherId}")
    public ResponseEntity<Page<StudentListViewDto>> getAllStudentByIdTeacher(@PageableDefault(size = 10) Pageable pageable, @PathVariable Long teacherId) {
        Page<StudentListViewDto> studentListViewDtoPage = studentService.showAllStudent(teacherId, pageable);
        if (studentListViewDtoPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(studentListViewDtoPage, HttpStatus.OK);
    }

    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: get teacherID by accountId
     *
     * @param accountId
     * @return teacherId
     */

    @GetMapping("/find-teacher/{accountId}")
    public ResponseEntity<TeacherViewDto> getTeacher(@PathVariable("accountId") Long accountId){
        TeacherViewDto teacherViewDto = this.teacherService.findIdTeacher(accountId);
        return new ResponseEntity<>(teacherViewDto, HttpStatus.OK);
    }
}
