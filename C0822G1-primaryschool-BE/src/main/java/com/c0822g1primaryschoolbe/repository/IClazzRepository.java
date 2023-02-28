package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IClazzRepository extends JpaRepository<Clazz, Long> {

    @Transactional
    @Modifying
    @Query(value = "select * from clazz",countQuery = "select * from clazz", nativeQuery = true)
    List<Clazz> findAllClazz();
}
