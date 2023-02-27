package com.c0822g1primaryschoolbe.service.timetable;

import com.c0822g1primaryschoolbe.entity.time_table_subject.ITimetable;
import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;

import java.util.List;

public interface ITimetableService {

    List<ITimetable>getAllTimetable();
}
