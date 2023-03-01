package com.c0822g1primaryschoolbe.controller;


import com.c0822g1primaryschoolbe.dto.IStudentDto;
import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * create by :VinhLD
 * date create 27/02/2023
 *
 * funtion : search student by name and status
 * @param "name, status"
 *
 * @return httpStatus.Notfound if result is error or HttpStatus.Ok if result is not error
 */


@CrossOrigin("*")
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private IStudentService studentService;

//    @GetMapping("")
//    public ResponseEntity<Page<Student>> findByName(@RequestParam(value = "name", defaultValue = "") String name,
//                                                    @RequestParam(value = "status", defaultValue = "") String status,
//                                                    @PageableDefault(value = 3) Pageable pageable) {
//
//        Page<Student> students = studentService.findByName(name, status, pageable);
//        if (students.isEmpty()) {
//            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(students, HttpStatus.OK);
//
//    }

    @GetMapping("")
    public ResponseEntity<Page<IStudentDto>> findByStatus(@RequestParam(value = "name", defaultValue = "") String name,
                                                          @RequestParam(defaultValue = "false") Boolean status,
                                                          @PageableDefault(value = 3) Pageable pageable) {

        Page<IStudentDto> studentPage = studentService.findByNameAndStatus(name, status, pageable);
        if (studentPage.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(studentPage, HttpStatus.OK);
    }
}
