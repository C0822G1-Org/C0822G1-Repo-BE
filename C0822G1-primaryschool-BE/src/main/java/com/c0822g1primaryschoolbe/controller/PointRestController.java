package com.c0822g1primaryschoolbe.controller;
import com.c0822g1primaryschoolbe.dto.EditPointDto;
import com.c0822g1primaryschoolbe.dto.PointManagementDto;
import com.c0822g1primaryschoolbe.service.point.IPointManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    /**
     * Created by: MinhCDK
     * Date created: 22/03/2023
     * Function: editListPoint
     *
     * @Param: teacherID
     */

    @PutMapping("/editPoint")
    public ResponseEntity<?> editPoint(@Validated @RequestBody EditPointDto editPointDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        iPointManagementService.editPoint(editPointDto.getSemesterOne(), editPointDto.getSemesterTwo(), editPointDto.getId());

        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Created by: MinhCDK
     * Date created: 28/02/2023
     * Function: searchStudentName
     *
     * @Param: teacherID
     */

    @GetMapping("/search")
    public ResponseEntity<List<PointManagementDto>> findByStudentName(@RequestParam Long teacherId,
                                                                      @RequestParam String studentName) {
        List<PointManagementDto> pointManagementDtos = iPointManagementService.findByStudentName(teacherId, studentName);
        if (pointManagementDtos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(pointManagementDtos, HttpStatus.OK);
    }
}
