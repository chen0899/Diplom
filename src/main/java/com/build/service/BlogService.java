package com.build.service;

import com.build.persistence.model.Blog;

import java.util.List;

public interface BlogService {
    Blog save(Blog blog);

    Blog findOne(Long id);

    List<Blog> findAll();

    boolean delete(Long id);

}
