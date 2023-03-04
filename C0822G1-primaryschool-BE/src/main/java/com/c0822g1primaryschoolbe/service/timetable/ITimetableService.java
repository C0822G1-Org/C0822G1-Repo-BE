package com.c0822g1primaryschoolbe.service.timetable;

import com.c0822g1primaryschoolbe.entity.time_table_subject.ITimetable;
import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;

import java.util.List;

public interface ITimetableService {
    /**
     * Create by : NamHH
     * Date created: 27/02/2023
     * Function: get all timetable where id_clazz
     *
     * @Param idClazz
     */
    List<ITimetable>getAllTimetable(Long idClazz);
//    List<List<ITimetable>>getAllTimetable(Long idClazz);

   void updateTimetable(Long idTimetable, Long idSubject);
}
