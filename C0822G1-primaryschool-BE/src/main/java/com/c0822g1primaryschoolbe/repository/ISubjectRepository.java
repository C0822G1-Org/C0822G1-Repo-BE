package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.time_table_subject.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ISubjectRepository extends JpaRepository<Subject,Long> {

    @Query(value = "select * from subject",countQuery = "select * from subject", nativeQuery = true)
    List<Subject> findAllSubject();
}
