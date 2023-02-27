package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.clazz.IClazzName;
import com.c0822g1primaryschoolbe.entity.clazz.IClazzTeacher;
import com.c0822g1primaryschoolbe.entity.clazz.IClazzYear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IClazzRepository extends JpaRepository<Clazz, Integer> {

    @Query(value = "select c.year as year from clazz c where delete_flag=true group by year;", nativeQuery = true)
    List<IClazzYear> getListYear();

    @Query(value = "select c.clazz_id as id,c.clazz_name as name from clazz c where delete_flag=true and year=:year and clazz_name like concat(:name,'%') ",nativeQuery = true)
    List<IClazzName> getListClazzName(@Param("year") int year, @Param("name") String name);

    @Transactional
    @Query(value = "select c.clazz_id as id,c.clazz_name as name,c.school_year as schoolYear,t.teacher_id as teacherId,t.teacher_name as teacherName from clazz c join teacher t on c.teacher_id=t.teacher_id where (c.year=:year and c.clazz_id=:clazzId and c.delete_flag=true);",
    countQuery ="select c.clazz_id as id,c.clazz_name as name,c.school_year as schoolYear,t.teacher_id as teacherId,t.teacher_name as teacherName from clazz c join teacher t on c.teacher_id=t.teacher_id where (c.year=:year and c.clazz_id=:clazzId and c.delete_flag=true);" ,nativeQuery = true)
    IClazzTeacher getClazzTeacher(@Param("year") int year, @Param("clazzId") int clazzId);

//    @Transactional
//    @Query(value = "update clazz set teacher_id=:teacherId where clazz_id=:clazzId")
//    void editTeacher(@Param("teacherId") int teacherId,@Param("clazzId") int clazzId);
}
