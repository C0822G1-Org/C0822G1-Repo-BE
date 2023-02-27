package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.entity.clazz.IClazzName;
import com.c0822g1primaryschoolbe.entity.clazz.IClazzTeacher;
import com.c0822g1primaryschoolbe.entity.clazz.IClazzYear;
import com.c0822g1primaryschoolbe.entity.student.IStudentInfo;
import com.c0822g1primaryschoolbe.entity.teacher.ITeacherInfo;
import com.c0822g1primaryschoolbe.service.IClazzService;
import com.c0822g1primaryschoolbe.service.IStudentService;
import com.c0822g1primaryschoolbe.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private IStudentService iStudentService;
    @Autowired
    private IClazzService iClazzService;
    @Autowired
    private ITeacherService iTeacherService;

    @GetMapping("/student-list")
    public Page<IStudentInfo> getStudentList(@PageableDefault(size = 10) Pageable pageable, @RequestParam String year, @RequestParam String clazzId){
        return iStudentService.getStudentList(pageable,Integer.parseInt(year),Integer.parseInt(clazzId));
    }

    @GetMapping("/year")
    public List<IClazzYear> getListYear(){
        return iClazzService.getListYear();
    }

    @GetMapping()
    public List<IClazzName> getListName(@RequestParam("year") String year, @RequestParam("name") String name){
        return iClazzService.getListName(Integer.parseInt(year),name);
    }

    @GetMapping("/clazz")
    public IClazzTeacher getClazzTeacher(@RequestParam String year, @RequestParam String clazzId){
        return iClazzService.getClazzTeacher(Integer.parseInt(year),Integer.parseInt(clazzId));
    }

    @GetMapping("/teacher-name-list")
    public List<ITeacherInfo> getListNameTeacher(@RequestParam String year){
        return iTeacherService.getListNameTeacher(Integer.parseInt(year));
    }

    @GetMapping("/teacher-name")
    public ITeacherInfo getNameTeacher(@RequestParam String name,@RequestParam String year){
        return iTeacherService.getNameTeacher(name,Integer.parseInt(year));
    }

    //    @GetMapping("/edit-teacher")
//    public void editTeacher(@RequestParam String teacherId,@RequestParam String clazzId){
//        iClazzService.editTeacher(Integer.parseInt(teacherId),Integer.parseInt(clazzId));
//    }
}
