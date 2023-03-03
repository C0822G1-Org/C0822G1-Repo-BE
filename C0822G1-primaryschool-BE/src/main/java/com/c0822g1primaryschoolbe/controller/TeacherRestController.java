package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.dto.TeacherDto;
import com.c0822g1primaryschoolbe.service.teacher.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/teacher")
@CrossOrigin("*")
public class TeacherRestController {
    @Autowired
    private ITeacherService iTeacherService;

    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: editInfoTeacher
     */

    @PutMapping("/editInfoTeacher")
    public ResponseEntity<?> editInfoTeacher(@RequestBody TeacherDto teacherDto) {
        System.out.println("zzzzz");
        teacherDto.setTeacherId(1L);
        iTeacherService.editInfoTeacher(teacherDto.getEmail(), teacherDto.getPhoneNumber(), teacherDto.getAddress(), teacherDto.getTeacherId());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
