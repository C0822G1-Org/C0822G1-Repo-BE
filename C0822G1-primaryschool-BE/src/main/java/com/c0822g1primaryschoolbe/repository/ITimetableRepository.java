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

    /**
     * Create by : NamHH
     * Date created: 27/02/2023
     * Function: get all timetable where id_clazz
     *
     * @Param idClazz
     */
    @Modifying
    @Query(value = "select time_table.time_table_id as timetableId,\n" +
            "       c.clazz_id               as clazzId,\n" +
            "       c.clazz_name             as clazzName,\n" +
            "       s.subject_id             as subjectId,\n" +
            "       s.subject_name           as subjectName\n" +
            "from `primary-school-management`.time_table\n" +
            "         join `primary-school-management`.clazz c on c.clazz_id = time_table.clazz_id\n" +
            "         join `primary-school-management`.subject s on s.subject_id = time_table.subject_id\n" +
            "where time_table.clazz_id = :idClazz",
            countQuery = "select time_table.time_table_id as timetableId,\n" +
                    "       c.clazz_id               as clazzId,\n" +
                    "       c.clazz_name             as clazzName,\n" +
                    "       s.subject_id             as subjectId,\n" +
                    "       s.subject_name           as subjectName\n" +
                    "from `primary-school-management`.time_table\n" +
                    "         join `primary-school-management`.clazz c on c.clazz_id = time_table.clazz_id\n" +
                    "         join `primary-school-management`.subject s on s.subject_id = time_table.subject_id\n" +
                    "where time_table.clazz_id = :idClazz", nativeQuery = true)
    List<ITimetable> getAllTimetable(@Param("idClazz") Long idClazz);
//    List<List<ITimetable>> getAllTimetable(@Param("idClazz") Long idClazz);


    /**
     * Create by : NamHH
     * Date created: 27/02/2023
     * Function: update timetable where id_timetable
     */
    @Modifying
    @Query(value = "update `primary-school-management`.time_table tt set tt.subject_id = :idSubject where time_table_id=:idTimetable", countQuery = "update `primary-school-management`.time_table tt set tt.subject_id = :idSubject where time_table_id=:idTimetable", nativeQuery = true)
    void updateTimetable(Long idTimetable, Long idSubject);
}
