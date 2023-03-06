package com.c0822g1primaryschool.repository;

import com.c0822g1primaryschool.entity.teacher.ITeacherInfo;
import com.c0822g1primaryschool.dto.teacher.TeacherViewDto;
import com.c0822g1primaryschool.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher,Long> {

    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     * @param year
     * Description: take teacher info by id year
     **/
    @Query(value = "select t.teacher_id as id,t.teacher_name as name,t.id_card as idCard from teacher t where t.teacher_id not in (select t.teacher_id from teacher t join clazz c on t.teacher_id=c.teacher_id where c.year=:year) and flag_delete=false;", nativeQuery = true)
    List<ITeacherInfo> getListNameTeacher(@Param("year") int year);


    /**
     * Create by:TrungNQ
     * Date create:27/2/2023
     * Funciton: get teacher name by Param
     */
    @Query(value ="select t.teacher_id as id,t.teacher_name as name,t.id_card as idCard from teacher t where t.teacher_id not in (select t.teacher_id from teacher t join clazz c on t.teacher_id=c.teacher_id where c.year=:year) and t.id_card=:idCard and flag_delete=false;", nativeQuery = true)
    ITeacherInfo getNameTeacher(@Param("idCard")String idCard,@Param("year") int year);


    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take teacher by id Account
     * @param accountId
     * *return Teacher
     **/
    @Query(value = "select teacher.teacher_id as teacherId from teacher\n" +
            "where teacher.account_id=:accountId", nativeQuery = true, countQuery = "select teacher.teacher_id as teacherId from teacher\n" +
            "where teacher.account_id=:accountId")
    TeacherViewDto findIdTeacher(@Param("accountId") Long accountId);
}
