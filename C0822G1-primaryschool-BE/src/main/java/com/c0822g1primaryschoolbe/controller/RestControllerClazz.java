package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/clazz/v1")
public class RestControllerClazz {

    @Autowired
    private ClazzService clazzService;

    @GetMapping("")
    public ResponseEntity<Page<Clazz>> searchByContent(@PageableDefault(value = 5) Pageable pageable,
                                                       @RequestParam (defaultValue = "") String keySearch1) {
//        String nameClazzSearch = keySearch1.orElse("");
        Page<Clazz> clazz = clazzService.findAllClazz(pageable, keySearch1);
        clazz.hasNext();
        if (clazz.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(clazz, HttpStatus.OK);
    }

}
