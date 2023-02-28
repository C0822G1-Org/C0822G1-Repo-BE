package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("api/student")
public class StudentRestController
{
    /**
     * Create by : NuongHT
     * Date create: 27/02/2023
     * Description: get student by studentID
     *
     * @param 'studentID'
     * @return student
     */

    @Autowired
    private IStudentService iStudentService;


    @GetMapping("/info/{id}")
    public ResponseEntity<Student> getInfoStudent(@PathVariable Long id) {
        Student student = iStudentService.findById(id).orElse(null);
        if(student == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
