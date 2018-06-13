package com.build.service;

import com.build.persistence.model.House;

import java.sql.Timestamp;
import java.util.List;

public interface HouseService {

    House save(House house);

    House findOne(Long id);

    List<House> findAll();

    boolean delete(Long id);

    List<House> findTop3OrOrderByData();

    String getImage(Long id);

    House addImage(Long id, String image);

    List<House> filter(Double price, Double priceOfOneSpace, Integer countRoom, Integer space, String houseName);

}
