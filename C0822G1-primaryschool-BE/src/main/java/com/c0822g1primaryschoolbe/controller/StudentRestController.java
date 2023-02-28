package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.dto.student.StudentDto;
import com.c0822g1primaryschoolbe.dto.student.StudentListViewDto;
import com.c0822g1primaryschoolbe.dto.teacher.TeacherViewDto;
import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.service.IStudentService;
import com.c0822g1primaryschoolbe.service.teacher.ITeacherService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentRestController {
    @Autowired
    private IStudentService studentService;

    @Autowired
    private ITeacherService teacherService;

    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take student list by id teacher
     *
     * @param pageable
     * @return
     */

    @GetMapping("/list-student/{teacherId}")
    public ResponseEntity<Page<StudentListViewDto>> getAllStudentByIdTeacher(@PageableDefault(size = 5) Pageable pageable, @PathVariable Long teacherId) {
        Page<StudentListViewDto> studentListViewDtoPage = studentService.showAllStudent(teacherId, pageable);
        if (studentListViewDtoPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(studentListViewDtoPage, HttpStatus.OK);
    }

    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: get teacherID by accountId
     *
     * @param accountId
     * @return teacherId
     */

    @GetMapping("/find-teacher/{accountId}")
    public ResponseEntity<TeacherViewDto> getTeacher(@PathVariable("accountId") Long accountId){
        TeacherViewDto teacherViewDto = this.teacherService.findIdTeacher(accountId);
        return new ResponseEntity<>(teacherViewDto, HttpStatus.OK);
    }
    /**
     * Create by: HoangNM
     * Date created: 27/02/2023
     * Function: find Student by id
     *
     * @param studentId
     * @return student,HttpStatus.OK
     */
    @GetMapping("/{studentId}")
    public ResponseEntity<Student> findByIdStudent(@PathVariable Long studentId){
        Student student = this.studentService.findId(studentId);
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
