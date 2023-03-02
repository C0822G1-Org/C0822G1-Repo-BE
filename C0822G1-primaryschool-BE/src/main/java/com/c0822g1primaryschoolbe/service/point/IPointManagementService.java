package com.c0822g1primaryschoolbe.service.point;

import com.c0822g1primaryschoolbe.dto.PointManagementDto;
import com.c0822g1primaryschoolbe.entity.student.PointManagement;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPointManagementService {
    List<PointManagementDto> showListPoint(Long teacherId);

    void editPoint(Double semesterOne, Double semesterTwo, Long id);

    List<PointManagementDto> findByStudentName(Long teacherId, String studentName);
}
