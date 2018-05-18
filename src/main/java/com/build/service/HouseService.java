package com.build.service;

import com.build.model.House;

import java.util.List;

public interface HouseService {

    House save (House house);

    House findOne(Long id);

    List<House> findAll();

    boolean delete(Long id);
}
