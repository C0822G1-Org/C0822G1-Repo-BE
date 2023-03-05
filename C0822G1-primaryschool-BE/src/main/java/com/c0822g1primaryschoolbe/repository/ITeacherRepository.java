package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.dto.teacher.ITeacherDto;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.c0822g1primaryschoolbe.entity.teacher.ITeacherInfo;
import com.c0822g1primaryschoolbe.dto.teacher.TeacherViewDto;

import java.util.List;

@Repository
@Transactional
public interface ITeacherRepository extends JpaRepository<Teacher, Long> {

    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: editInfoTeacher
     */

    @Modifying
    @Query(value = "update teacher set email = :email, phone_number = :phoneNumber, address = :address where teacher_id= :teacherId", nativeQuery = true)
    void editInfoTeacher(@Param("email") String email,
                         @Param("phoneNumber") String phoneNumber,
                         @Param("address") String address,
                         @Param("teacherId") Long teacherId);


    /**
     * Create by : TrungNQ
     * Date create: 27/02/2023
     *
     * @param year Description: take teacher info by id year
     **/
    @Query(value = "select t.teacher_id as id,t.teacher_name as name,t.id_card as idCard from teacher t where t.teacher_id not in (select t.teacher_id from teacher t join clazz c on t.teacher_id=c.teacher_id where c.year=:year);", nativeQuery = true)
    List<ITeacherInfo> getListNameTeacher(@Param("year") int year);


    /**
     * Create by:TrungNQ
     * Date create:27/2/2023
     * Funciton: get teacher name by Param
     */
    @Query(value = "select t.teacher_id as id,t.teacher_name as name,t.id_card as idCard from teacher t where (t.teacher_id not in (select t.teacher_id from teacher t join clazz c on t.teacher_id=c.teacher_id where c.year=:year) and t.id_card=:idCard);", nativeQuery = true)
    ITeacherInfo getNameTeacher(@Param("idCard") String idCard, @Param("year") int year);


    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take teacher by id Account
     *
     * @param accountId *return Teacher
     **/
    @Query(value = "select teacher.teacher_id as teacherId from teacher\n" +
            "where teacher.account_id=:accountId", nativeQuery = true, countQuery = "select teacher.teacher_id as teacherId from teacher\n" +
            "where teacher.account_id=:accountId")
    TeacherViewDto findIdTeacher(@Param("accountId") Long accountId);

    /**
     * Created by: MinhCDK
     * Date created: 03/03/2023
     * Function: findByTeacherDto
     */

    @Query(value = "select teacher_id as teacherId, teacher_name as teacherName, date_of_birth as dateOfBirth, gender as gender, d.degree_name as degreeName, teacher_type as teacherType, id_card as idCard, email as email, phone_number as phoneNumber, address as address from teacher join degree d on d.degree_id = teacher.degree_id where teacher_id =:teacherId", nativeQuery = true)
    ITeacherDto findByTeacherDto(@Param("teacherId") Long teacherId);

}
