package com.c0822g1primaryschoolbe.controller;


import com.c0822g1primaryschoolbe.entity.blog.Blog;
import com.c0822g1primaryschoolbe.service.impl.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
@CrossOrigin("*")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("")
    public ResponseEntity<Page<Blog>> getAll(@PageableDefault(page = 0, size = 3) Pageable pageable) {
        Page<Blog> blogPage = blogService.allPageBlog(pageable);
        if (blogPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogPage, HttpStatus.OK);
    }


}
