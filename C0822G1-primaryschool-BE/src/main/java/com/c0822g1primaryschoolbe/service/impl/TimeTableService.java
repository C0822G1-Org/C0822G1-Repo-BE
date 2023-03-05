package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.dto.time_table.TimeTableView;
import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;
import com.c0822g1primaryschoolbe.repository.ITimeTableRepository;
import com.c0822g1primaryschoolbe.service.student.ITimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeTableService implements ITimeTableService {
    @Autowired
    private ITimeTableRepository timeTableRepository;
    /**
     * Created by: VanNTC
     * Date Created: 27/02/2023
     *  * Description: get time table of the class by id
     */
    @Override
    public List<TimeTableView> getTimeTableByIdTeacher(String teacherId) {
        return timeTableRepository.getAllByIdTeacher(teacherId);
    }
}
