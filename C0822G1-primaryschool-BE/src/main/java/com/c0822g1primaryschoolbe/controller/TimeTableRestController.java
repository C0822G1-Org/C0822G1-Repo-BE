package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;
import com.c0822g1primaryschoolbe.service.student.ITimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/teacher/time-table")
@CrossOrigin("*")
public class TimeTableRestController {
    @Autowired
    private ITimeTableService timeTableService;

    @GetMapping("/{teacherId}")
    public ResponseEntity<TimeTable> showTimeTable(@PathVariable Long teacherId){
        TimeTable timeTable = null;
        if (timeTableService.getTimeTableById(timeTable.getTimeTableId()) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        timeTable = this.timeTableService.getTimeTableById(teacherId);
        return new ResponseEntity<>(timeTable, HttpStatus.OK);

    }
}
