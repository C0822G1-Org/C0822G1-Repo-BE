package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.time_table_subject.ITimetable;
import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ITimetableRepository extends JpaRepository<TimeTable, Long> {
    @Modifying
    @Query(value = "select tts.id               as timeSubId,\n" +
            "       subject.subject_id   as subId,\n" +
            "       clazz.clazz_name     as nameClazz,\n" +
            "       lesson.lesson_name   as nameLesson,\n" +
            "       day.day_name         as nameDay,\n" +
            "       subject.subject_name as nameSubject\n" +
            "from time_table tt\n" +
            "         join day on day.day_id = tt.day_id\n" +
            "         join lesson on lesson.lesson_id = tt.lesson_id\n" +
            "         join time_table_subject tts on tts.time_table_id = tt.time_table_id\n" +
            "         join subject on tts.subject_id = subject.subject_id\n" +
            "         join clazz on tt.clazz_id = clazz.clazz_id\n" +
            "where clazz.clazz_id = :idClazz\n" +
            "order by day.day_name, lesson.lesson_name", countQuery = "select tts.id               as timeSubId,\n" +
            "       subject.subject_id   as subId,\n" +
            "       clazz.clazz_name     as nameClazz,\n" +
            "       lesson.lesson_name   as nameLesson,\n" +
            "       day.day_name         as nameDay,\n" +
            "       subject.subject_name as nameSubject\n" +
            "from time_table tt\n" +
            "         join day on day.day_id = tt.day_id\n" +
            "         join lesson on lesson.lesson_id = tt.lesson_id\n" +
            "         join time_table_subject tts on tts.time_table_id = tt.time_table_id\n" +
            "         join subject on tts.subject_id = subject.subject_id\n" +
            "         join clazz on tt.clazz_id = clazz.clazz_id\n" +
            "where clazz.clazz_id = :idClazz\n" +
            "order by day.day_name, lesson.lesson_name", nativeQuery = true)
    List<ITimetable> getAllTimetable(@Param("idClazz")Long idClazz);
}
