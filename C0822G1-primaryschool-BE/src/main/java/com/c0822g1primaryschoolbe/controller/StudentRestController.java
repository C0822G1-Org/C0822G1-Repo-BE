package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.service.IClazzService;
import com.c0822g1primaryschoolbe.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class StudentRestController {


    @Autowired
    private IStudentService iStudentService;
    @Autowired
    private IClazzService iClazzService;

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAll() {
        List<Student> studentList = iStudentService.findAll();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
    @GetMapping("/clazz")
    public ResponseEntity<List<Clazz>> getAllClazz() {
        List<Clazz> clazzList = iClazzService.findAll();
        return new ResponseEntity<>(clazzList, HttpStatus.OK);
    }

    @GetMapping("/info/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id) {
        Student student = iStudentService.findById(id);
//        try {
//            if (student == null && student.isDeleteFlag()) {
//                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            }
//        } catch (NullPointerException e) {
//            e.getStackTrace();
//        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

}
