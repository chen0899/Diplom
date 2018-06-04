package com.build.controller;

import com.build.model.Blog;
import com.build.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/save")
    private Blog save(@RequestBody Blog blog) {
        return blogService.save(blog);
    }

    @GetMapping("/find-all")
    private List<Blog> findAll(){
        return blogService.findAll();
    }


    @GetMapping("/find-one/{id}")
    private Blog findOne(@PathVariable Long id){
        return blogService.findOne(id);
    }

    @DeleteMapping("/delete/{id}")
    private Boolean delete(@PathVariable Long id) {
        return blogService.delete(id);
    }

}
