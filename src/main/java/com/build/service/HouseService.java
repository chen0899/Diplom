package com.build.service;

import com.build.persistence.model.House;

import java.sql.Timestamp;
import java.util.List;

public interface HouseService {

    House save (House house);

    House findOne(Long id);

    List<House> findAll();

    boolean delete(Long id);

    List<House> findTop3OrOrderByData();

}
