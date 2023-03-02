package com.c0822g1primaryschoolbe.controller;


import com.c0822g1primaryschoolbe.dto.IStudentDto;
import com.c0822g1primaryschoolbe.dto.StudentDtoToSearch;
import com.c0822g1primaryschoolbe.dto.TeacherDtoToSearch;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import com.c0822g1primaryschoolbe.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;

    /**
     * create by :VinhLD
     * date create 27/02/2023
     *
     * funtion : search techer by name and status
     * @param "name, status"
     *
     * @return httpStatus.Notfound if result is error or HttpStatus.Ok if result is not error
     */
    @GetMapping("")
    public ResponseEntity<Page<Teacher>> findByName(
            @RequestParam(value = "name", defaultValue = "") String name,
            @RequestParam( defaultValue = "false") Boolean status,
            @PageableDefault(value = 3) Pageable pageable) {
        Page<Teacher> teachers = teacherService.findByName(name, status, pageable);
        if (teachers.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<>(teachers, HttpStatus.OK);


    }

    @PostMapping("/search")
    public ResponseEntity<Page<Teacher>> searchTeacher(@RequestBody TeacherDtoToSearch teacherDtoToSearch,
                                                       @PageableDefault(value = 5) Pageable pageable){


        if (teacherDtoToSearch == null || ObjectUtils.isEmpty(teacherDtoToSearch)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Page<Teacher> teacherPage = teacherService.searchTeacher(teacherDtoToSearch, pageable);
        if (teacherPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(teacherPage, HttpStatus.OK);
    }



}
