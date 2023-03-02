package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clazz")
@CrossOrigin("*")
public class ClazzRestController {
    @Autowired
    private IClazzService clazzService;

    @GetMapping("")
    public ResponseEntity<List<Clazz>> getAll() {
        List<Clazz> clazzList = clazzService.getAll();
        if (clazzList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(clazzList, HttpStatus.OK);
    }

}