package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.blogDto.BlogDto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<BlogDto> allPageBlog(Pageable pageable);
}
