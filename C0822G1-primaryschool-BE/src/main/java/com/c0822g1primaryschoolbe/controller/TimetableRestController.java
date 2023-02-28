package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.time_table_subject.ITimetable;
import com.c0822g1primaryschoolbe.entity.time_table_subject.Subject;
import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;
import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTableSubject;
import com.c0822g1primaryschoolbe.repository.ITimetableRepository;
import com.c0822g1primaryschoolbe.service.class_service.IClazzService;
import com.c0822g1primaryschoolbe.service.subject.ISubjectService;
import com.c0822g1primaryschoolbe.service.timetable.ITimetableService;
import com.c0822g1primaryschoolbe.service.timetable_subject_service.ITimetableSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class TimetableRestController {
    @Autowired
    private ITimetableService timetableService;
    @Autowired
    private IClazzService clazzService;
    @Autowired
    private ITimetableSubjectService timetableSubjectService;
    @Autowired
    private ISubjectService subjectService;


    /**
     * Create by : NamHH
     * Date created: 27/02/2023
     * Function: get all timetable where id_clazz
     *
     * @Param idClazz
     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
     */

    @GetMapping(value = "/listTimetable/{idClazz}")
    public ResponseEntity<List<ITimetable>> getAllTimetable(@PathVariable("idClazz") Long idClazz) {
        List<ITimetable> listTimetable = timetableService.getAllTimetable(idClazz);
        if (listTimetable.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(listTimetable, HttpStatus.OK);
    }


    /**
     * Create by : NamHH
     * Date created: 27/02/2023
     * Function: update timetableSubject where id_timetable_subject
     *
     * @Return HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error
     */
    @PatchMapping(value = "/updateTimetableSubject")
    public ResponseEntity<List<TimeTableSubject>> updateTimetableSubject(@RequestBody List<TimeTableSubject> timeTableSubjectList) {
        for (TimeTableSubject timeTableSubject : timeTableSubjectList) {
            if (timeTableSubject == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            timetableSubjectService.updateTimetableSubject(timeTableSubject.getSubject().getSubjectId(), timeTableSubject.getId());
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }


    /**
     * Create by : NamHH
     * Date created: 28/02/2023
     * Function: get all subject
     *
     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
     */
    @GetMapping(value = "/listSubject")
    public ResponseEntity<List<Subject>> findAllSubject() {
        List<Subject> subjectList = subjectService.findAllSubject();
        if (subjectList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(subjectList, HttpStatus.OK);
    }
}
