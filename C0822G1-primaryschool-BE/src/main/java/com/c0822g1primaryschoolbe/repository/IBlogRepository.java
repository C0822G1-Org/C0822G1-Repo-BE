package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.blog.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Long> {
    @Query(value = "select * from blog", nativeQuery = true)
    Page<Blog> allList(Pageable pageable);
}
