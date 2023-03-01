package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.clazz.Block;
import org.springframework.data.repository.query.Param;

public interface IBlockService{

    Block findByIdBlock(@Param("blockId") Long blockId);
}
