package com.c0822g1primaryschoolbe.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class BlockDto implements Validator {
    private Long blockId;

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }

}
