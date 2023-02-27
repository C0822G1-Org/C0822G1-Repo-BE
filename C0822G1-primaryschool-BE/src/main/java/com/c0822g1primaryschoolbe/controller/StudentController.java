package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
@CrossOrigin("*")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    /**
     * Create by: HoangNM
     * Date created: 27/02/2023
     * Function: find Student by id
     *
     * @param id
     * @return student,HttpStatus.OK
     */
    @GetMapping("{id}")
    public ResponseEntity<Student> findByIdStudent(@PathVariable("id") long id){
        Student student = studentService.findId(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    /**
     * Create by: HoangNM,
     * Date created: 27/02/2023
     * Function: create Student by id
     *
     * @param student
     * @return HttpStatus.CREATED
     */
    @PostMapping("/create_student")
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        studentService.create(student.getImg(), student.getStudentName(), student.getDateOfBirth(), student.getGender(), student.getFatherName(), student.getPhoneNumberFather(), student.getFatherJob(), student.getMotherName(), student.getPhoneNumberMother(),student.getMotherJob(), student.getReligion(), student.getAddress(), student.getClazz().getClazzId());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * Create by: HoangNM,
     * Date created: 27/02/2023
     * Function: update Student by id
     *
     * @param student
     * @return HttpStatus.OK
     */
    @PutMapping("/update_student")
    public ResponseEntity<?> updateStudent(@RequestBody Student student){
        studentService.update(student.getImg(), student.getStudentName(), student.getDateOfBirth(), student.getGender(), student.getFatherName(), student.getPhoneNumberFather(), student.getFatherJob(), student.getMotherName(), student.getPhoneNumberMother(),student.getMotherJob(), student.getReligion(), student.getAddress(),  student.getClazz().getClazzId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
