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

    @Override
    public List<ITimetable> getAllTimetable() {
        return timetableRepository.getAllTimetable();
    }

}
