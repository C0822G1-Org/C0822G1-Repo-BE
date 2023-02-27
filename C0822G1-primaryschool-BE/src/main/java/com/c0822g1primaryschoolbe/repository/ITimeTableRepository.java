package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ITimeTableRepository extends JpaRepository<Student, Long> {
    /**
     * Created by: VanNTC
     * Date Created: 27/02/2023
     *  * Description: get list time table of the class
     */

    @Query(value = "SELECT lesson.lesson_name,\n" +
            "       MAX(CASE WHEN day.day_name = 'Thứ 2' THEN subject.subject_name ELSE NULL END) AS Monday,\n" +
            "       MAX(CASE WHEN day.day_name = 'Thứ 3' THEN subject.subject_name ELSE NULL END) AS Tuesday,\n" +
            "       MAX(CASE WHEN day.day_name = 'Thứ 4' THEN subject.subject_name ELSE NULL END) AS Wednesday,\n" +
            "       MAX(CASE WHEN day.day_name = 'Thứ 5' THEN subject.subject_name ELSE NULL END) AS Thursday,\n" +
            "       MAX(CASE WHEN day.day_name = 'Thứ 6' THEN subject.subject_name ELSE NULL END) AS Friday\n" +
            "FROM time_table\n" +
            "         JOIN day ON time_table.day_id = day.day_id\n" +
            "         JOIN lesson ON time_table.lesson_id = lesson.lesson_id\n" +
            "         JOIN time_table_subject ON time_table.time_table_id = time_table_subject.time_table_id\n" +
            "         JOIN subject ON time_table_subject.subject_id = subject.subject_id\n" +
            "         JOIN clazz c ON c.clazz_id = time_table.clazz_id\n" +
            "         JOIN teacher t ON c.clazz_id = t.clazz_id\n" +
            "where teacher_id = :teacherId\n" +
            "GROUP BY lesson.lesson_id, lesson.lesson_name", nativeQuery = true, countQuery = "SELECT lesson.lesson_name,\n" +
            "       MAX(CASE WHEN day.day_name = 'Thứ 2' THEN subject.subject_name ELSE NULL END) AS Monday,\n" +
            "       MAX(CASE WHEN day.day_name = 'Thứ 3' THEN subject.subject_name ELSE NULL END) AS Tuesday,\n" +
            "       MAX(CASE WHEN day.day_name = 'Thứ 4' THEN subject.subject_name ELSE NULL END) AS Wednesday,\n" +
            "       MAX(CASE WHEN day.day_name = 'Thứ 5' THEN subject.subject_name ELSE NULL END) AS Thursday,\n" +
            "       MAX(CASE WHEN day.day_name = 'Thứ 6' THEN subject.subject_name ELSE NULL END) AS Friday\n" +
            "FROM time_table\n" +
            "         JOIN day ON time_table.day_id = day.day_id\n" +
            "         JOIN lesson ON time_table.lesson_id = lesson.lesson_id\n" +
            "         JOIN time_table_subject ON time_table.time_table_id = time_table_subject.time_table_id\n" +
            "         JOIN subject ON time_table_subject.subject_id = subject.subject_id\n" +
            "         JOIN clazz c ON c.clazz_id = time_table.clazz_id\n" +
            "         JOIN teacher t ON c.clazz_id = t.clazz_id\n" +
            "where teacher_id = teacherId\n" +
            "GROUP BY lesson.lesson_id, lesson.lesson_name")
    TimeTable getAllByIdTeacher(@Param("teacherId") Long teacherId);
}
