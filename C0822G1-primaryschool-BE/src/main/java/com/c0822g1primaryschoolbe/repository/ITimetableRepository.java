package com.c0822g1primaryschoolbe.repository;

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
    @Query(value = "select * from time_table", nativeQuery = true)
    List<TimeTable> getAllTimetable();
}
