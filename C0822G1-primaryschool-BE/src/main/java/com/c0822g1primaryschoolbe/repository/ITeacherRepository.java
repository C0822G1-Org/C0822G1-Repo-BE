package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.teacher.ITeacherInfo;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher,Long> {
    @Query(value = "select t.teacher_id as id,t.teacher_name as name,t.id_card as idCard from teacher t where t.teacher_id not in (select t.teacher_id from teacher t join clazz c on t.teacher_id=c.teacher_id where c.year=:year);", nativeQuery = true)
    List<ITeacherInfo> getListNameTeacher(@Param("year") int year);

    @Query(value ="select t.teacher_id as id,t.teacher_name as name,t.id_card as idCard from teacher t where (t.teacher_id not in (select t.teacher_id from teacher t join clazz c on t.teacher_id=c.teacher_id where c.year=:year) and t.id_card=:name);", nativeQuery = true)
    ITeacherInfo getNameTeacher(@Param("name")String name,@Param("year") int year);
}
