package com.build.controller;

import com.build.model.Flat;
import com.build.model.House;
import com.build.service.FlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flat")
public class FlatController {

    @Autowired
    private FlatService flatService;

    @PostMapping("/save")
    private Flat save(@RequestBody Flat flat) {
        return flatService.save(flat);
    }

    @GetMapping("/find-all")
    private List<Flat> findAll(){
        return flatService.findAll();
    }


    @GetMapping("/find-one/{id}")
    private Flat findOne(@PathVariable Long id){
        return flatService.findOne(id);
    }

    @DeleteMapping("/delete/{id}")
    private Boolean delete(@PathVariable Long id) {
        return flatService.delete(id);
    }
}
