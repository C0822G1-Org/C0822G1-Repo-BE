package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;
import com.c0822g1primaryschoolbe.repository.ITimeTableRepository;
import com.c0822g1primaryschoolbe.service.student.ITimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeTableService implements ITimeTableService {

    @Autowired
    private ITimeTableRepository timeTableRepository;


    @Override
    public TimeTable getTimeTableById(Long teacherId) {
        return timeTableRepository.getAllByIdTeacher(teacherId);
    }
}
