package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;
import com.c0822g1primaryschoolbe.repository.ITimetableRepository;
import com.c0822g1primaryschoolbe.service.timetable.ITimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class TimetableRestController {
    @Autowired
    private ITimetableService timetableService;

    /**
     * Create by : NamHH
     * Date created: 27/02/2023
     * Function: get all timetable where id_clazz*/

//    @GetMapping(value = "/listTimetable")
//    public ResponseEntity<List<TimeTable>> getAllTimetable() {
//        List<TimeTable> listTimetable = timetableService.getAllTimetable();
//        if (listTimetable.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(listTimetable, HttpStatus.OK);
//    }


}
