package com.c0822g1primaryschoolbe.service.impl;
import com.c0822g1primaryschoolbe.dto.ClazzStudentDto;
import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;

import com.c0822g1primaryschoolbe.repository.IClassRepository;
import com.c0822g1primaryschoolbe.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService implements IClassService {
    @Autowired
    private IClassRepository iClassRepository;

    @Override
    public void createChooseClass(Clazz clazz) {
        Long a = Long.parseLong(String.valueOf(clazz.getClazzName().trim().charAt(0)));
        Block block = new Block(a);
        clazz.setBlock(block);
        iClassRepository.createChooseClass(clazz.getClazzName(),clazz.getSchoolYear(),clazz.getBlock(),clazz.getTeacher());
    }

    @Override
    public List<ClazzStudentDto> showListClassStudentById(long id) {
        return iClassRepository.showListClassStudentById(id);
    }

}
