package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public interface IClazzRepository extends JpaRepository<Clazz, Long> {

    @Query(value =
            " select *" +
                    " from clazz c " +
                    "join teacher t on t.teacher_id = c.teacher_id " +
                    "join block b on b.block_id = c.block_id " +
                    "where clazz_name like concat('%', :keySearch1 ,'%') " +
                    "and c.flag_delete=false " +
                    "order by c.clazz_id desc",
            countQuery =
                    " select *" +
                            " from clazz c " +
                            "join teacher t on t.teacher_id = c.teacher_id " +
                            "join block b on b.block_id = c.block_id " +
                            "where clazz_name like concat('%', :keySearch1 ,'%') " +
                            "and c.flag_delete=false " +
                            "order by c.clazz_id desc ",
            nativeQuery = true)
    Page<Clazz> findAllClazz(Pageable pageable, @Param("keySearch1") String keySearch1);

    @Query(value ="SELECT * from clazz where clazz_id = :clazzId and flag_delete = false",
            countQuery = "SELECT * from clazz where clazz_id = :clazzId and flag_delete = false",
            nativeQuery = true)
    Clazz findByIdClazz(@Param("clazzId") Long clazzId);

    @Transactional
    @Modifying
    @Query(value =
            "UPDATE clazz c SET c.teacher_id = :teacherId, " +
                    "c.clazz_name = :clazzName, " +
                    "c.flag_delete = :flagDelete, " +
                    "c.school_year = :schoolYear, " +
                    "c.year = :year," +
                    "c.block_id =:blockId " +
                    "WHERE c.clazz_id = :clazzId" ,

            nativeQuery = true)
    void updateClazz(
                     @Param("clazzId") Long clazzId,
                     @Param("teacherId") Long teacherId,
                     @Param("clazzName") String clazzName,
                     @Param("flagDelete") Boolean flagDelete,
                     @Param("schoolYear") String schoolYear,
                     @Param("year") Integer year,
                     @Param("blockId") Long blockId);

//    @Transactional
//    @Modifying
//    @Query(value = "update clazz set teacher_id =:#{#clazz.teacherId}, clazz_name=:#{#clazz.clazzName}," +
//            "flag_delete=false where clazz_id= :#{#clazz.clazzId} ", nativeQuery = true)
//    void updateClazz(@Param("clazz") Clazz clazz);


//    @Transactional
//    @Modifying
//    @Query(value = "update clazz set teacher_id = :teacherId  where clazz_id = :clazzId",
//            countQuery = "update clazz set teacher_id = :teacherId  where clazz_id = :clazzId",
//            nativeQuery = true)
//    void updateClazz( Clazz clazz,@Param("clazzId") Long clazzId);



}
