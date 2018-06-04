package com.build.controller;

import com.build.model.House;
import com.build.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @PostMapping("/save")
    private ResponseEntity<House> save(@RequestBody House house) {
        return ResponseEntity.ok(houseService.save(house));
    }

    @GetMapping("/find-all")
    private ResponseEntity<List<House>> findAll(){
        return ResponseEntity.ok(houseService.findAll());
    }


    @GetMapping("/find-one/{id}")
    private ResponseEntity<House> findOne(@PathVariable Long id){
        return ResponseEntity.ok(houseService.findOne(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity delete(@PathVariable Long id) {
        return new ResponseEntity(houseService.delete(id)? HttpStatus.OK:HttpStatus.CONFLICT);
    }

}
