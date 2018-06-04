package com.build.controller;

import com.build.persistence.model.Flat;
import com.build.service.FlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flat")
public class FlatController {

    @Autowired
    private FlatService flatService;

    @PostMapping("/save")
    private ResponseEntity<Flat> save(@RequestBody Flat flat) {
        return ResponseEntity.ok(flatService.save(flat));
    }

    @GetMapping("/find-all")
    private ResponseEntity<List<Flat>> findAll(){
        return ResponseEntity.ok(flatService.findAll());
    }


    @GetMapping("/find-one/{id}")
    private ResponseEntity<Flat> findOne(@PathVariable Long id){
        return ResponseEntity.ok(flatService.findOne(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity delete(@PathVariable Long id) {
        return new ResponseEntity(flatService.delete(id)?HttpStatus.OK:HttpStatus.CONFLICT);
    }
}
