package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.entity.*;
import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import com.c0822g1primaryschoolbe.service.ClazzService;
import com.c0822g1primaryschoolbe.service.ITeacherService;
import com.c0822g1primaryschoolbe.service.BlockService;
import com.c0822g1primaryschoolbe.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/clazz")
public class ClazzRestController {


    @Autowired
    private ClazzService clazzService;

    @Autowired
    private ITeacherService teacherService;

    @Autowired
    private BlockService blockService;

    @Autowired
    private StudentService studentService;

    /**
     * Create by : TuanNDN
     * @return
     */
    @GetMapping("")
    public ResponseEntity<Page<Clazz>> searchByContent(@PageableDefault(value = 5) Pageable pageable,
                                                       @RequestParam (defaultValue = "" )  String keySearch1) {
        Page<Clazz> clazz = clazzService.findAllClazz(pageable, keySearch1);
        if (clazz.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(clazz, HttpStatus.OK);
    }

    /**
     * Create by : TuanNDN
     * @return
     */
    @GetMapping("/info/{id}")
    public ResponseEntity<Clazz> findById(@PathVariable("id") Long id) {
        Clazz clazz = clazzService.findByIdClazz(id);
        if (clazz == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(clazz, HttpStatus.OK);
    }


    /**
     * Create by : TuanNDN
     * @return
     */
    @PutMapping ("/update/{clazzId}")
    public ResponseEntity<Clazz> updateClazz(@PathVariable("clazzId") Long clazzId,
                                        @Valid @RequestBody ClassStudentDto classStudentDto,
                                        BindingResult bindingResult) {
        Clazz clazz = clazzService.findByIdClazz(clazzId);
        Optional<Teacher> teacher = teacherService.findByIdTeacher(classStudentDto.getTeacher().getTeacherId());
        Block block = blockService.findByIdBlock(classStudentDto.getBlock().getBlockId());
        if (clazz == null) {
            return new ResponseEntity<>(clazz,HttpStatus.BAD_REQUEST);
        } else {
            BeanUtils.copyProperties(classStudentDto, clazz);
            clazz.setTeacher(teacher.get());
            clazz.setBlock(block);
            clazzService.updateClazz(clazz);
            return new ResponseEntity<>(HttpStatus.OK);

        }
    }
    /**
     * Create by : TuanNDN
     * @return
     */
    @GetMapping("teacher")
    public ResponseEntity<List<ITeacherDto>> showListTeacher() {
        List<ITeacherDto> teachers = teacherService.showListTeacher();
        if (teachers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }
    /**
     * Create by : TuanNDN
     * @return
     */
    @GetMapping("block")
    public ResponseEntity<List<Block>> showListBlock() {
        List<Block> blocks = blockService.showListBlock();
        if (blocks.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blocks, HttpStatus.OK);
    }

    /**
     * Create by : TuanNDN
     * @return
     */
    @GetMapping("student")
    public ResponseEntity<List<Student>> showListStudent() {
        List<Student> students = studentService.showListStudent();
        if (students.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    /**
     * create by : DungND
     * Data create: 31/01/2023
     * funcion: showListClass()
     * @return HttpStatus.NOT_FOUND if result is not found or HttpStatus.OK is find
     */
    @GetMapping("/list-class")
    public ResponseEntity<List<Clazz>> showListClass() {
        try {
            clazzService.showListAll();
        }catch (Exception e) {

        }
        List<Clazz> listClass = clazzService.showListAll();
        if (listClass.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(listClass, HttpStatus.OK);
    }
    /**
     * create by : DungND
     * Data create: 31/01/2023
     * funcion: showListClassStudentById()
     * @param 'id'
     * @return HttpStatus.NOT_FOUND if result is not found or HttpStatus.OK is find
     */
    @GetMapping("/{id}")
    public ResponseEntity<List<ClazzStudentDto>> showListClassStudentById(@PathVariable("id") long id) {
        List<ClazzStudentDto> listClass = clazzService.showListClassStudentById(id);
        if (listClass.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(listClass, HttpStatus.OK);
    }
    /**
     * Create by: DungND
     * Date created: 31/01/2023
     * Function: save dataForm
     * @param classDto
     * @param bindingResult
     * @return HttpStatus.CREATED when the data is saved to the database, HttpStatus.NOT_MODIFIED when an error occurs
     */
    @PostMapping("/save")
    public ResponseEntity<Clazz> save(@Valid @RequestBody ClazzDto classDto, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ResponseEntity(bindingResult.getAllErrors(), HttpStatus.NOT_MODIFIED);
        }
        Clazz clazz = new Clazz();
        BeanUtils.copyProperties(classDto,clazz);
        Teacher teacher = new Teacher();
        teacher.setTeacherId(classDto.getTeacherDto().getTeacherId());
        clazz.setTeacher(teacher);
        LocalDate today = LocalDate.now();
        Integer year = today.getYear();
        clazz.setYear(year);
        clazzService.createChooseClass(clazz);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
