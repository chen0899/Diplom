package com.build.controller;

import com.build.model.User;
import com.build.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    private User save(@RequestBody User user ) {
       return userService.save(user, null);
    }

    @GetMapping("/find-all")
    private List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/find-by-name/{name}")
    private List<User> findByName(@PathVariable String name){
        return userService.findByName(name);
    }

    @GetMapping("/find-by-email/{email}")
    private User findByEmail(@PathVariable String email){
        return userService.findByEmail(email);
    }

    @GetMapping("/find-one/{id}")
    private User findOne(@PathVariable Long id){
        return userService.findOne(id);
    }

    @DeleteMapping("/delete/{id}")
    private Boolean delete(@PathVariable Long id) {
        return userService.delete(id);
    }






}
