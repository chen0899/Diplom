package com.build.controller;

import com.build.model.House;
import com.build.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @PostMapping("/save")
    private House save(@RequestBody House house) {
        return houseService.save(house);
    }

    @GetMapping("/find-all")
    private List<House> findAll(){
        return houseService.findAll();
    }


    @GetMapping("/find-one/{id}")
    private House findOne(@PathVariable Long id){
        return houseService.findOne(id);
    }

    @DeleteMapping("/delete/{id}")
    private Boolean delete(@PathVariable Long id) {
        return houseService.delete(id);
    }

}
