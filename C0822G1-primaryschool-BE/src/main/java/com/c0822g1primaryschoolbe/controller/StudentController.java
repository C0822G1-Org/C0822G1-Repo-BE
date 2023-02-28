package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.dto.StudentDto;
import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.service.impl.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
@CrossOrigin("*")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * Create by: HoangNM
     * Date created: 27/02/2023
     * Function: find Student by id
     *
     * @param studentId
     * @return student,HttpStatus.OK
     */
    @GetMapping("{studentId}")
    public ResponseEntity<Student> findByIdStudent(@PathVariable("studentId") Long studentId){
        Student student = studentService.findId(studentId);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    /**
     * Create by: HoangNM,
     * Date created: 27/02/2023
     * Function: create Student by id
     *
     * @param studentDto
     * @param bindingResult
     * @return HttpStatus.OK
     */
    @PostMapping("/create-student")
    public ResponseEntity<?> createStudent(@RequestBody @Validated StudentDto studentDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        Student student = new Student();
        BeanUtils.copyProperties(studentDto,student);
        studentService.create(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Create by: HoangNM,
     * Date created: 27/02/2023
     * Function: update Student by id
     *
     * @param studentDto
     * @param bindingResult
     * @return HttpStatus.OK
     */
    @PutMapping("/update-student/{student-id}")
    public ResponseEntity<?> updateStudent(@RequestBody @Validated StudentDto studentDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        Student student = new Student();
        BeanUtils.copyProperties(studentDto,student);
        studentService.update(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
