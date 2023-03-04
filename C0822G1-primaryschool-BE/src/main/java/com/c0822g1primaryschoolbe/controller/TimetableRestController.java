package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.entity.time_table_subject.IClazz;
import com.c0822g1primaryschoolbe.entity.time_table_subject.ITimetable;
import com.c0822g1primaryschoolbe.entity.time_table_subject.ITimetableUpdate;
import com.c0822g1primaryschoolbe.entity.time_table_subject.Subject;
import com.c0822g1primaryschoolbe.service.IClazzService;
import com.c0822g1primaryschoolbe.service.subject.ISubjectService;
import com.c0822g1primaryschoolbe.service.timetable.ITimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/timetable")
@CrossOrigin("*")
public class TimetableRestController {
    @Autowired
    private ITimetableService timetableService;

    @Autowired
    private ISubjectService subjectService;

    @Autowired
    private IClazzService clazzService;


    /**
     * Create by : NamHH
     * Date created: 27/02/2023
     * Function: get all timetable where id_clazz
     *
     * @Param idClazz
     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
     */
    @GetMapping(value = "/list-timetable/{idClazz}")
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
     * Function: update subject_id in timetable where id_timetable
     *
     * @Return HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error
     */
    @PutMapping(value = "/update-timetable")
    public ResponseEntity<?> updateTimetableSubject(@RequestBody List<ITimetableUpdate> iTimetableUpdates) {
        for (ITimetableUpdate iTimetableUpdate : iTimetableUpdates) {
            if (iTimetableUpdate == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            timetableService.updateTimetable(iTimetableUpdate.getTimetableId(), iTimetableUpdate.getSubjectId());
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
    @GetMapping(value = "/list-subject")
    public ResponseEntity<List<Subject>> findAllSubject() {
        List<Subject> subjectList = subjectService.findAllSubject();
        if (subjectList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(subjectList, HttpStatus.OK);
    }


    /**
     * Create by : NamHH
     * Date created: 01/03/2023
     * Function: get all clazz
     *
     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
     */
    @GetMapping("/list-clazz/{bockId}")
    public ResponseEntity<List<IClazz>> showListClazz(@PathVariable("bockId") Long bockId) {
        List<IClazz> clazzList = clazzService.showListClazz(bockId);
        if (clazzList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(clazzList, HttpStatus.OK);
    }


    /**
     * Create by : NamHH
     * Date created: 01/03/2023
     * Function: get clazz
     *
     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
     */
    @GetMapping("/object-clazz/{clazzId}")
    public ResponseEntity<IClazz> showClazz(@PathVariable("clazzId") Long clazzId) {
        IClazz iClazz = clazzService.showClazz(clazzId);
        if (iClazz == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(iClazz, HttpStatus.OK);
    }

}
