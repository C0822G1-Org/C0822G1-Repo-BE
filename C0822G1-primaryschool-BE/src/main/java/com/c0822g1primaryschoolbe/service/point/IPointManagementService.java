package com.c0822g1primaryschoolbe.service.point;

import com.c0822g1primaryschoolbe.dto.PointManagementDto;
import com.c0822g1primaryschoolbe.entity.student.PointManagement;

import java.util.List;

public interface IPointManagementService {
    List<PointManagementDto> showListPoint(Long teacherId);
}
