package com.c0822g1primaryschoolbe.service.point.impl;

import com.c0822g1primaryschoolbe.dto.PointManagementDto;
import com.c0822g1primaryschoolbe.entity.student.PointManagement;
import com.c0822g1primaryschoolbe.repository.IPointManagementRepository;
import com.c0822g1primaryschoolbe.service.point.IPointManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PointManagementService implements IPointManagementService {
@Autowired
    private IPointManagementRepository iPointManagementRepository;


    @Override
    public List<PointManagementDto> showListPoint(Long teacherId) {
        return iPointManagementRepository.showListPoint(teacherId);
    }
}
