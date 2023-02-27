package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public interface IClazzRepository extends JpaRepository<Clazz,Long> {
    @Query(value = "select c.* from clazz as c;",nativeQuery = true)
    List<Clazz> findAll();
}
