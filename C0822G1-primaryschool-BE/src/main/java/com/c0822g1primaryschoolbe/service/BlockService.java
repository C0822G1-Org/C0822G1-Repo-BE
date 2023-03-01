package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.clazz.Block;
import com.c0822g1primaryschoolbe.repository.IBlockRepository;
import com.c0822g1primaryschoolbe.service.IBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlockService implements IBlockService {

    @Autowired
    private IBlockRepository blockRepository;

    @Override
    public Block findByIdBlock(Long blockId) {
        return blockRepository.findByIdBlock(blockId);
    }
}
