package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTableSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ITimetableSubjectRepository extends JpaRepository<TimeTableSubject, Long> {
    @Modifying
    @Transactional
    @Query(value = "update time_table_subject set subject_id =:idSubject where id = :idTimeSub", nativeQuery = true)
    void updateTimetableSubject(@Param("idSubject") Long idSubject, @Param("idTimeSub") Long idTimeSub);
}
