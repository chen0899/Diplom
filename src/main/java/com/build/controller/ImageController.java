package com.build.controller;

import com.build.persistence.model.Image;
import com.build.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

import static org.springframework.http.CacheControl.maxAge;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping("/find-one/{id}")
    private ResponseEntity<Image> findOne(@PathVariable Long id){
        return ResponseEntity.ok(imageService.findOne(id));
    }

    @PostMapping(value="/save/{id}",consumes = "text/plain")
    private ResponseEntity<Image> save(@RequestBody String image,@PathVariable Long id) {
        return ResponseEntity.ok(imageService.save(image, id));
    }

    @GetMapping("/source/{id}")
    private ResponseEntity<String> getSource(@PathVariable Long id) {
        return ResponseEntity.ok().cacheControl(maxAge(31556926, TimeUnit.SECONDS).cachePublic()).body(imageService.findOne(id).getImage());
    }

}
