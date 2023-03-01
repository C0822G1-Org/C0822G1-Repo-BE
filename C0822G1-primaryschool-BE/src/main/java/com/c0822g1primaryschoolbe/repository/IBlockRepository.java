package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBlockRepository extends JpaRepository<Block, Long> {

    @Query(value ="SELECT * from block where block_id = :blockId",
            countQuery = "SELECT * from block where block_id = :blockId",
            nativeQuery = true)
    Block findByIdBlock(@Param("blockId") Long blockId);

}
