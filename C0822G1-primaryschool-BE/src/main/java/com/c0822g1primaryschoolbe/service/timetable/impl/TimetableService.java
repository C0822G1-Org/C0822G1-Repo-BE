package com.c0822g1primaryschoolbe.service.timetable.impl;

import com.c0822g1primaryschoolbe.entity.time_table_subject.ITimetable;
import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;
import com.c0822g1primaryschoolbe.repository.ITimetableRepository;
import com.c0822g1primaryschoolbe.service.timetable.ITimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimetableService implements ITimetableService {
    @Autowired
    private ITimetableRepository timetableRepository;

    /**
     * Create by : NamHH
     * Date created: 27/02/2023
     * Function: get all timetable where id_clazz
     *
     * @Param idClazz
     */
    @Override
    public List<ITimetable> getAllTimetable(Long idClazz) {
        return timetableRepository.getAllTimetable(idClazz);
    }
//    public List<List<ITimetable>> getAllTimetable(Long idClazz) {
//        return timetableRepository.getAllTimetable(idClazz);
//    }

    @Override
    public void updateTimetable(Long idTimetable, Long idSubject) {
        timetableRepository.updateTimetable(idTimetable, idSubject);
    }


}
