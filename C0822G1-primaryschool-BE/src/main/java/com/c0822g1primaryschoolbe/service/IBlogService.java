package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.blog.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> allPageBlog(Pageable pageable);
}
