package com.c0822g1primaryschool.service.student;

import com.c0822g1primaryschool.dto.time_table.TimeTableView;

import java.util.List;

public interface ITimeTableService {
    /**
     * Created by: VanNTC
     * Date Created: 27/02/2023
     *  * Description: get time table of the class by id
     */
    List<TimeTableView> getTimeTableByIdTeacher(String teacherId);
}
