package com.c0822g1primaryschoolbe.service.point.impl;

import com.c0822g1primaryschoolbe.dto.PointManagementDto;
import com.c0822g1primaryschoolbe.repository.IPointManagementRepository;
import com.c0822g1primaryschoolbe.service.point.IPointManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointManagementService implements IPointManagementService {
    @Autowired
    private IPointManagementRepository iPointManagementRepository;

    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: showListPoint
     *
     * @Param: teacherID
     */

    @Override
    public List<PointManagementDto> showListPoint(Long teacherId) {
        return iPointManagementRepository.showListPoint(teacherId);
    }

    /**
     * Created by: MinhCDK
     * Date created: 22/03/2023
     * Function: editListPoint
     *
     * @Param: teacherID
     */

    @Override
    public void editPoint(Double semesterOne, Double semesterTwo, Long id) {
        iPointManagementRepository.editPoint(semesterOne, semesterTwo, id);
    }

    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: searchStudentName
     *
     * @Param: teacherID
     */

    @Override
    public List<PointManagementDto> findByStudentName(Long teacherId, String studentName) {
        return iPointManagementRepository.findByStudentName(teacherId, studentName);
    }
}
