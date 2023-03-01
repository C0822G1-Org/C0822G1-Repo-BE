package com.c0822g1primaryschoolbe.controller;


import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import com.c0822g1primaryschoolbe.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;






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


}
