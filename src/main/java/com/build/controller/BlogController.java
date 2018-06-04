package com.build.controller;

import com.build.persistence.model.Blog;
import com.build.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/save")
    private ResponseEntity<Blog> save(@RequestBody Blog blog) {
        return ResponseEntity.ok(blogService.save(blog));
    }

    @GetMapping("/find-all")
    private ResponseEntity<List<Blog>> findAll(){
        return ResponseEntity.ok(blogService.findAll());
    }


    @GetMapping("/find-one/{id}")
    private ResponseEntity<Blog> findOne(@PathVariable Long id){
        return ResponseEntity.ok(blogService.findOne(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity delete(@PathVariable Long id) {
        return new ResponseEntity(blogService.delete(id)?HttpStatus.OK:HttpStatus.CONFLICT);
    }

}
