package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.entity.ClassStudentDto;
import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import com.c0822g1primaryschoolbe.service.ClazzService;
import com.c0822g1primaryschoolbe.service.ITeacherService;
import com.c0822g1primaryschoolbe.service.TeacherService;
import com.c0822g1primaryschoolbe.service.BlockService;
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
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/clazz/v1")
public class RestControllerClazz {

    @Autowired
    private ClazzService clazzService;

    @Autowired
    private ITeacherService teacherService;

    @Autowired
    private BlockService blockService;

    @GetMapping("")
    public ResponseEntity<Page<Clazz>> searchByContent(@PageableDefault(value = 5) Pageable pageable,
                                                       @RequestParam Optional<String> keySearch1) {
        String nameClazzSearch = keySearch1.orElse("");
        Page<Clazz> clazz = clazzService.findAllClazz(pageable, nameClazzSearch);
        clazz.hasNext();
        if (clazz.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(clazz, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Clazz> findById(@PathVariable("id") Long id) {
        Clazz clazz = clazzService.findByIdClazz(id);
        if (clazz == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(clazz, HttpStatus.OK);
    }



    @PutMapping("/update/{clazzId}")
    public ResponseEntity<Clazz> updateClazz(@PathVariable("clazzId") Long clazzId,
                                        @Valid @RequestBody ClassStudentDto classStudentDto,
                                        BindingResult bindingResult) {
        Clazz clazz = clazzService.findByIdClazz(clazzId);
        Optional<Teacher> teacher = teacherService.findByIdTeacher(classStudentDto.getTeacher().getTeacherId());
        if (!teacher.isPresent()){

        }
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


}
