package com.c0822g1primaryschoolbe.controller;


import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("")
    public ResponseEntity<Page<Student>> findByName(@RequestParam(value = "name", defaultValue = "") String name,
                                                    @RequestParam(value = "status", defaultValue = "") String status,
                                                    @PageableDefault(value = 3) Pageable pageable) {

        Page<Student> students = studentService.findByName(name, status, pageable);
        if (students.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(students, HttpStatus.OK);

    }
}
