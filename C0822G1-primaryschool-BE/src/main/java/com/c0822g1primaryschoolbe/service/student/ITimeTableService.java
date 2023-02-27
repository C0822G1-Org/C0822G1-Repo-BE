package com.c0822g1primaryschoolbe.service.student;

import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;

public interface ITimeTableService {
    /**
     * Created by: VanNTC
     * Date Created: 27/02/2023
     *  * Description: get time table of the class by id
     */
    TimeTable getTimeTableById(Long teacherId);
}
