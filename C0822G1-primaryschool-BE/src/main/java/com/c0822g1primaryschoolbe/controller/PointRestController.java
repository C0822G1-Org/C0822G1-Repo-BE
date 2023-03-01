package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.dto.EditPointDto;
import com.c0822g1primaryschoolbe.dto.PointManagementDto;
import com.c0822g1primaryschoolbe.service.point.IPointManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pointManagement")
@CrossOrigin("*")
public class PointRestController {
    @Autowired
    private IPointManagementService iPointManagementService;

    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: showListPoint
     *
     * @Param: teacherID
     */
    @GetMapping("/{teacherId}")
    public ResponseEntity<List<PointManagementDto>> showListPoint(@PathVariable Long teacherId) {
        List<PointManagementDto> pointManagementDtos = iPointManagementService.showListPoint(teacherId);
        if (pointManagementDtos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(pointManagementDtos, HttpStatus.OK);
    }

    @PutMapping("/editPoint")
    public ResponseEntity<?> editPoint(@RequestBody EditPointDto editPointDto) {
        iPointManagementService.editPoint(editPointDto.getSemesterOne(), editPointDto.getSemesterTwo(), editPointDto.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
