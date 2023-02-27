package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.blogDto.BlogDto;

import com.c0822g1primaryschoolbe.repository.IBlogRepository;
import com.c0822g1primaryschoolbe.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Page<BlogDto> allPageBlog(Pageable pageable) {
        return iBlogRepository.allList(pageable);
    }
}
