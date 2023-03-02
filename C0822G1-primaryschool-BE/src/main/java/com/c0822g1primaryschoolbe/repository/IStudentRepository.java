package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.dto.student.StudentListViewDto;
import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take student list by id teacher
     *
     * @param pageable
     * @return Page<StudentListViewDto>
     */

    @Query(value = "select `student`.student_id as studentId, `student`.student_name as studentName, `student`.gender as gender,"  +
            " `student`.date_of_birth as dateOfBirth, `clazz`.clazz_name as nameClazz " +
            "from `student` " +
            "join `clazz` on `student`.clazz_id = `clazz`.clazz_id " +
            "join `teacher` on `clazz`.teacher_id = `teacher`.teacher_id " +
            "where `teacher`.teacher_id= :teacherId and `student`.flag_delete = false " +
            "order by `student`.student_name ", nativeQuery = true)
    Page<StudentListViewDto> showAllStudent(@Param("teacherId") Long teacherId, Pageable pageable);
}
