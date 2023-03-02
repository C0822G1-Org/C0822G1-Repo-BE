package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.dto.IStudentDto;
import com.c0822g1primaryschoolbe.dto.StudentDtoToSearch;
import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface StudentRepository extends JpaRepository<Student, Long> {
//
//    @Query(value = "select `student`.student_name as studentName ,`student`.student_id as idStudent, `student`.date_of_birth as dateOfBirthStudent, `clazz`.clazz_name as studentClazz, ((point_management.semester_one+point_management.semester_two*2)/3) as studentPoint from student left join clazz" +
//            " on student.clazz_id = clazz.clazz_id left join point_management on student.student_id= point_management.student_id where student.student_name like %:name% and student.student_status = :status order by student.student_name asc", nativeQuery = true)
//    Page<Student> findByName(@Param("name") String name,
//                             @Param("status") String status,
//                             Pageable pageable);

    /**
     * create by :VinhLD
     * date create 27/02/2023
     *
     * funtion : search student by name and status
     *
     * @param "name"
     * @return
     */


    @Query(value = " SELECT student.*, `clazz`.`clazz_name` as studentClazz, ((`point_management`.semester_one + `point_management`.semester_two*2)/3) as studentPoint from student LEFT JOIN clazz on student.clazz_id = clazz.clazz_id LEFT JOIN point_management on student.`student_id` = point_management.`student_id` WHERE student.student_name like %:name% and student.student_status =:status ORDER BY student.student_name ASC", nativeQuery = true,
            countQuery = " SELECT student.*, clazz.clazz_name as studentClazz, ((point_management.semester_one + point_management.semester_two*2)/3) as studentPoint from student LEFT JOIN clazz on student.clazz_id = clazz.clazz_id LEFT JOIN point_management on student.`student_id` = point_management.`student_id` WHERE student.student_name like %:name% and student.student_status =:status ORDER BY student.student_name ASC")
    Page<Student> findByName(@Param("name") String name,
                             @Param("status") String status,
                             Pageable pageable);


    @Query(value = "select `student`.student_name as nameStudent, " +
            "`student`.student_id as idStudent, " +
            "`student`.date_of_birth as dateOfBirthStudent, " +
            "clazz.clazz_name as nameClazz, " +
            "((point_management.semester_one+point_management.semester_two*2)/3) as studentPoint " +
            "from student left join clazz on `student`.clazz_id = clazz.clazz_id " +
            "left join point_management on student.student_id= point_management.student_id " +
            "where student.student_name like %:name% and student.student_status = :status " +
            "order by student.student_name asc",
            countQuery = "select * from (select `student`.student_name as nameStudent, \n" +
                    "            `student`.student_id as idStudent, \n" +
                    "            `student`.date_of_birth as dateOfBirthStudent, \n" +
                    "            clazz.clazz_name as nameClazz, \n" +
                    "            ((point_management.semester_one+point_management.semester_two*2)/3) as studentPoint \n" +
                    "            from student left join clazz on `student`.clazz_id = clazz.clazz_id \n" +
                    "            left join point_management on student.student_id= point_management.student_id \n" +
                    "            where student.student_name like %:name% and student.student_status = :status \n" +
                    "            order by student.student_name asc) as newView;", nativeQuery = true)
    Page<IStudentDto> findByNameAndStatus(@Param("name") String name,
                                          @Param("status") Boolean status,
                                          Pageable pageable);

//        @Query(value = "SELECT nt.`id_notification` AS idNotification, nt.posting_date AS postingDate, nt.`title` AS `title`, nt.`content` AS `content` " +
//            " FROM `notification` AS nt " +
//            " WHERE nt.flag_delete = 0 " +
//            " AND nt.posting_date BETWEEN :#{#notificationSearchDto.startDate} AND NOW()" +
//            " AND nt.`title` LIKE %:#{#notificationSearchDto.title}% " +
//            " AND nt.`content` LIKE %:#{#notificationSearchDto.content}% " +
//            " ORDER BY nt.posting_date DESC, nt.id_notification DESC "
//            , nativeQuery = true)
//    Page<NotificationAllPropertyDto> searchNotifications(@Param("notificationSearchDto") NotificationSearchDto notificationSearchDto,
//                                                         Pageable pageable);



    /**
     * create by :VinhLD
     * date create 27/02/2023
     *funtion : search student by name and status
     * @param "name, status"
     * @return
     */
    @Query(value = "select `student`.student_name as nameStudent, " +
            " `student`.student_id as idStudent, " +
            " `student`.date_of_birth as dateOfBirthStudent, " +
            " `clazz`.clazz_name as nameClazz, " +
            " ((point_management.semester_one+point_management.semester_two*2)/3) as studentPoint " +
            " from `student` left join clazz on `student`.clazz_id = `clazz`.clazz_id " +
            " left join point_management on `student`.student_id = point_management.student_id " +
            " where `student`.student_name like %:#{#studentDtoToSearch.nameStudent}% " +
            " and `student`.student_status = :#{#studentDtoToSearch.studyStatus} " +
            " order by `student`.student_name asc", nativeQuery = true)
    Page<IStudentDto> searchStudent(@Param("studentDtoToSearch") StudentDtoToSearch studentDtoToSearch, Pageable pageable);
}
