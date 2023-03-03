package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.clazz.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IClazzRepository extends JpaRepository<Clazz, Long> {

    /**
     * Created by: TrungNQ
     * Date Created: 27/02/2023
     * * Description: get list year of the class
     */
    @Query(value = "select c.year as year from clazz c where c.flag_delete=true group by year order by year desc;", nativeQuery = true)
    List<IClazzYear> getListYear();


    /**
     * Created by: TrungNQ
     * Date Created: 27/02/2023
     * * Description: get list class name by param
     */
    @Query(value = "select c.clazz_id as id,c.clazz_name as name from clazz c where flag_delete=true and year=:year and clazz_name like concat(:name,'%') order by c.clazz_name", nativeQuery = true)
    List<IClazzName> getListClazzName(@Param("year") int year, @Param("name") String name);


    /**
     * Created by: TrungNQ
     * Date Created: 27/02/2023
     * * Description: get name class and name teacher of class
     */
    @Transactional
    @Query(value = "select c.clazz_id as id,c.clazz_name as name,c.school_year as schoolYear,t.teacher_id as teacherId,t.teacher_name as teacherName from clazz c join teacher t on c.teacher_id=t.teacher_id where (c.year=:year and c.clazz_id=:clazzId and c.flag_delete=true);", nativeQuery = true)
    IClazzTeacher getClazzTeacher(@Param("year") int year, @Param("clazzId") Long clazzId);


    /**
     * Created by: TrungNQ
     * Date Created: 27/02/2023
     * * Description: edit teacher of class by id
     */
    @Transactional
    @Modifying
    @Query(value = "update clazz set teacher_id =:teacherId where (clazz_id =:clazzId and flag_delete=true);", nativeQuery = true)
    void editTeacher(@Param("teacherId") Long teacherId, @Param("clazzId") Long clazzId);


    /**
     * Create by:TrungNQ
     * Date create:27/2/2023
     */
    @Query(value = "select * from clazz c where c.clazz_id=:clazzId and flag_delete=true;", nativeQuery = true)
    Clazz getClazzById(@Param("clazzId") Long clazzId);

     /** create: HoangNM
     * @return
     */
    @Query(value = "select c.* from clazz as c", nativeQuery = true)
    List<Clazz> getAll();
}
