package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.dto.student.StudentListViewDto;
import com.c0822g1primaryschoolbe.entity.student.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IStudentRepository extends JpaRepository<Student, Long> {
    /**
     * Create by : VanNTC
     * Date create: 27/02/2023
     * Description: take student list by id teacher
     * @param pageable
     * @return Page<StudentListViewDto>
     */

    @Query(value = "select s.student_id as studentId, s.student_name as StudentName, s.date_of_birth as gender, s.date_of_birth as dateOfBirth\n" +
            "from student s\n" +
            "         join student_clazz sc on s.student_id = sc.student_id\n" +
            "         join clazz c on sc.clazz_id = c.clazz_id\n" +
            "         join teacher t on t.clazz_id = c.clazz_id\n" +
            "where teacher_id=:teacherId and s.flag_delete=false\n" +
            "order by student_name", nativeQuery = true, countQuery = "select s.student_id as studentId, s.student_name as StudentName, s.date_of_birth as gender, s.date_of_birth as dateOfBirth\n" +
            "from student s\n" +
            "         join student_clazz sc on s.student_id = sc.student_id\n" +
            "         join clazz c on sc.clazz_id = c.clazz_id\n" +
            "         join teacher t on t.clazz_id = c.clazz_id\n" +
            "where teacher_id=:teacherId and s.flag_delete=false\n" +
            "order by student_name")
    Page<StudentListViewDto> showAllStudent(Pageable pageable);
}
