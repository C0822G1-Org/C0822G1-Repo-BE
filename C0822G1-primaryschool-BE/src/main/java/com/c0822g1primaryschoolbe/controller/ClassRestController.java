package com.c0822g1primaryschoolbe.controller;
import com.c0822g1primaryschoolbe.dto.ClazzDto;
import com.c0822g1primaryschoolbe.dto.ClazzStudentDto;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import com.c0822g1primaryschoolbe.service.IClassService;
import com.c0822g1primaryschoolbe.service.ITeacherService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("api/class")
public class ClassRestController {
    @Autowired
    private IClassService iClassService;
    @Autowired
    private ITeacherService iTeacherService;
    @GetMapping("teacher")
    public ResponseEntity<List<Teacher>> showListTeacher() {
        List<Teacher> teachers = iTeacherService.showListTeacher();
        if (teachers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(teachers, HttpStatus.OK);
    }

    /**
     * create by : DungND
     * Data create: 31/01/2023
     * funcion: findByIdClass()
     * @param 'id'
     * @return HttpStatus.NOT_FOUND if result is not found or HttpStatus.OK is find
     */
    @GetMapping("/{id}")
    public ResponseEntity<List<ClazzStudentDto>> showListClassStudentById(@PathVariable("id") long id) {
        List<ClazzStudentDto> listClass = iClassService.showListClassStudentById(id);
        if (listClass.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(listClass, HttpStatus.OK);
    }
    /**
     * Create by: DungND
     * Date created: 31/01/2023
     * Function: save dataForm
     * @param classDto
     * @param bindingResult
     * @return HttpStatus.CREATED when the data is saved to the database, HttpStatus.NOT_MODIFIED when an error occurs
     */
    @PostMapping("save")
    public ResponseEntity<Clazz> save(@Valid @RequestBody ClazzDto classDto, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ResponseEntity(bindingResult.getAllErrors(), HttpStatus.NOT_MODIFIED);
        }

        Clazz clazz = new Clazz();
        BeanUtils.copyProperties(classDto,clazz);
        Teacher teacher = new Teacher();
        teacher.setTeacherId(classDto.getTeacherDto().getTeacherId());
        clazz.setTeacher(teacher);
        iClassService.createChooseClass(clazz);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
