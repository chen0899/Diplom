package com.build.controller;

import com.build.persistence.model.House;
import com.build.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.springframework.http.CacheControl.maxAge;

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
    private ResponseEntity<List<House>> findAll() {
        return ResponseEntity.ok(houseService.findAll());
    }

    @GetMapping("/find-by-data")
    private ResponseEntity<List<House>> findTop3ByData() {
        return ResponseEntity.ok(houseService.findTop3OrOrderByData());
    }

    @GetMapping("/find-one/{id}")
    private ResponseEntity<House> findOne(@PathVariable Long id) {
        return ResponseEntity.ok(houseService.findOne(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity delete(@PathVariable Long id) {
        return new ResponseEntity(houseService.delete(id) ? HttpStatus.OK : HttpStatus.CONFLICT);
    }

    @GetMapping("/image/{id}")
    private ResponseEntity<String> getImage(@PathVariable Long id) {
        return ResponseEntity.ok().cacheControl(maxAge(31556926, TimeUnit.SECONDS).cachePublic()).body(houseService.getImage(id));
    }

    @PostMapping(value = "/image/{id}",consumes = "text/plain")
    private ResponseEntity<House> addImage (@PathVariable Long id, @RequestBody String image) {
        return ResponseEntity.ok(houseService.addImage(id,image));
    }
}
