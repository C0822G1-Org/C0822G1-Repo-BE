package com.c0822g1primaryschool.controller;

import com.c0822g1primaryschool.dto.time_table.TimeTableView;
import com.c0822g1primaryschool.service.student.ITimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/time-table")
@CrossOrigin("*")
public class TimeTableRestController {
    @Autowired
    private ITimeTableService timeTableService;

    /**
     * Created by: VanNTC
     * Date Created: 27/02/2023
     * * Description: get time table of the class by id
     */
    @GetMapping("/{teacherId}")
    public ResponseEntity<List<TimeTableView>> showTimeTable(@PathVariable String teacherId) {
        List<TimeTableView> timeTable = timeTableService.getTimeTableByIdTeacher(teacherId);
        if (timeTable.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(timeTable, HttpStatus.OK);
    }
}
