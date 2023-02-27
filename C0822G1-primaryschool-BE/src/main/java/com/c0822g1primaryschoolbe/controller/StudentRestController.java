package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.dto.student.StudentListViewDto;
import com.c0822g1primaryschoolbe.service.student.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
@CrossOrigin("*")
public class StudentRestController {
    @Autowired
    private IStudentService studentService;

    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take student list by id teacher
     *
     * @param pageable
     * @return
     */
    @GetMapping("/list-student")
    public ResponseEntity<Page<StudentListViewDto>> getAllStudentByIdTeacher(@PageableDefault(size = 5) Pageable pageable) {
        Page<StudentListViewDto> studentListViewDtoPage = studentService.showAllStudent(pageable);
        if (studentListViewDtoPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(studentListViewDtoPage, HttpStatus.OK);
    }
}
