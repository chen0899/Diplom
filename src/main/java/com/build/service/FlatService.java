package com.build.service;

import com.build.persistence.model.Flat;
import com.build.persistence.model.House;

import java.util.List;

public interface FlatService {
    Flat save(Flat flat);

    Flat  findOne(Long id);

    List<Flat> findAll();

    boolean delete(Long id);

    String getImage(Long id);

    Flat saveImage(Long id, String img, String imgFloor);

}
