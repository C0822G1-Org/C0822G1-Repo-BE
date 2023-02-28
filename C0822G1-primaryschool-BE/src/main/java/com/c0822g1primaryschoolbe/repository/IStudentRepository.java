package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.dto.student.StudentListViewDto;
import com.c0822g1primaryschoolbe.entity.student.Student;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IStudentRepository extends JpaRepository<Student, Long> {

    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take student list by id teacher
     *
     * @param pageable
     * @return Page<StudentListViewDto>
     */

    @Query(value = "select student.student_id, student.student_name, student.gender, student.date_of_birth\n" +
            "from student \n" +
            "join clazz on student.clazz_id = clazz.clazz_id\n" +
            "join teacher on clazz.teacher_id = teacher.teacher_id\n" +
            "where teacher.teacher_id= :teacherId and student.flag_delete = false\n" +
            "order by student.student_name", nativeQuery = true, countQuery = "select student.student_id, student.student_name, student.gender, student.date_of_birth\n" +
            "from student \n" +
            "join clazz on student.clazz_id = clazz.clazz_id\n" +
            "join teacher on clazz.teacher_id = teacher.teacher_id\n" +
            "where teacher.teacher_id=:teacherId and student.flag_delete = false\n" +
            "order by student.student_name")
    Page<StudentListViewDto> showAllStudent(Pageable pageable);
}
