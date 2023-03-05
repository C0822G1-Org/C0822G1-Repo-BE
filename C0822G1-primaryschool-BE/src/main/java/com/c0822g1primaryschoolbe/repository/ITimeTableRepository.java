package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.dto.time_table.TimeTableView;
import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITimeTableRepository extends JpaRepository<Student, Long> {
    /**
     * Created by: VanNTC
     * Date Created: 27/02/2023
     * * Description: get list timetable of the class
     */

    @Query(value = "select tt.time_table_id as timeTableId, `lesson`.lesson_name as nameLesson, `day`.day_name as nameDay, `subject`.subject_name as nameSubject from `time_table` tt\n" +
            "join `day` on `day`.day_id = tt.day_id\n" +
            "join `lesson` on `lesson`.lesson_id = tt.lesson_id\n" +
            "join `time_table_subject` tts on tts.time_table_id = tt.time_table_id\n" +
            "join `subject` on tts.subject_id = `subject`.subject_id\n" +
            "join `clazz` on tt.clazz_id = `clazz`.clazz_id\n" +
            "join `teacher` t on t.teacher_id = `clazz`.teacher_id\n" +
            "where   t.teacher_id= :teacherId\n" +
            "order by `day`.day_name, `lesson`.lesson_name", nativeQuery = true, countQuery = "select tt.time_table_id as timeTableId, `lesson`.lesson_name, `day`.day_name, `subject`.subject_name from `time_table` tt\n" +
            "join `day` on `day`.day_id = tt.day_id\n" +
            "join `lesson` on `lesson`.lesson_id = tt.lesson_id\n" +
            "join `time_table_subject` tts on tts.time_table_id = tt.time_table_id\n" +
            "join `subject` on tts.subject_id = `subject`.subject_id\n" +
            "join `clazz` on tt.clazz_id = `clazz`.clazz_id\n" +
            "join `teacher` t on t.teacher_id = `clazz`.teacher_id\n" +
            "where   t.teacher_id= :teacherId\n" +
            "order by `day`.day_name, `lesson`.lesson_name")
    List<TimeTableView> getAllByIdTeacher(String teacherId);
}
