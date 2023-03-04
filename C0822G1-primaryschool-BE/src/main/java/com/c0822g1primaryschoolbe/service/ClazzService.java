package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.ClazzStudentDto;
import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.c0822g1primaryschoolbe.entity.time_table_subject.IClazz;
import com.c0822g1primaryschoolbe.repository.IBlockRepository;
import com.c0822g1primaryschoolbe.repository.IClazzRepository;
import com.c0822g1primaryschoolbe.repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzService implements IClazzService {

    @Autowired
    private IClazzRepository clazzRepository;

    @Autowired
    private ITeacherRepository teacherRepository;

    @Autowired
    private IBlockRepository blockRepository;
    /**
     * Create by TuanNDN
     * @param pageable
     * @param keySearch1
     * @return
     */
    @Override
    public Page<Clazz> findAllClazz(Pageable pageable, String keySearch1) {
        return clazzRepository.findAllClazz(pageable, keySearch1);
    }

    /**
     * Create by TuanNDN
     * @param clazzId
     * @return
     */
    @Override
    public Clazz findByIdClazz(Long clazzId) {
        return clazzRepository.findByIdClazz(clazzId);
    }

    /**
     * Create by TuanNDN
     * @param clazz
     */
    @Override
    public void updateClazz(Clazz clazz) {
        clazzRepository.updateClazz(
                clazz.getClazzId(),
                clazz.getTeacher().getTeacherId(),
                clazz.getClazzName(),
                clazz.getFlagDelete(),
                clazz.getSchoolYear(),
                clazz.getYear(),
                clazz.getBlock().getBlockId());
    }

    /**
     * Create by TuanNDN
     */
    @Override
    public void upBlockNew() {
        clazzRepository.upBlockNew();
    }


    /** Method use: createChooseClass()
     * Created date: 27/02/2023
     * Function:showListAll
     * Parameter: contentClass
     * Author: DungND
     * */
    @Override
    public List<Clazz> showListAll() {
        return clazzRepository.showListAll();
    }

    /** Method use: createChooseClass()
     * Created date: 27/02/2023
     * Function:createChooseClass
     * Parameter: contentClass
     * Author: DungND
     * */
    @Override
    public void createChooseClass(Clazz clazz) {
        Long a = Long.parseLong(String.valueOf(clazz.getClazzName().trim().charAt(0)));
        Block block = new Block(a);
        clazz.setBlock(block);
        clazzRepository.createChooseClass(clazz.getClazzName(),clazz.getSchoolYear(),clazz.getBlock(),clazz.getTeacher(),clazz.getYear());
    }

    /**
     * create by : DungND
     * Data create: 27/02/2023
     * funcion: showListClassStudentById()
     * @param 'id'
     */
    @Override
    public List<ClazzStudentDto> showListClassStudentById(long id) {
        return clazzRepository.showListClassStudentById(id);
    }

    /**
     * Create by NamHH
     * Date 01/03/2023
     * Function: showListClazz
     **/
    @Override
    public List<IClazz> showListClazz(Long bockId) {
        return clazzRepository.showListClazz(bockId);
    }


    /**
     * Create by NamHH
     * Date 01/03/2023
     * Function: showClazz
     **/
    @Override
    public IClazz showClazz(Long clazzId) {
        return clazzRepository.showClazz(clazzId);
    }

}
