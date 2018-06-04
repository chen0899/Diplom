package com.build.service.impl;

import com.build.model.House;
import com.build.repository.HouseRepository;
import com.build.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class HouseServiceImpl implements HouseService{

    @Autowired
    private HouseRepository houseRepository;

    @Override
    public House save(House house) {
        house.setData(Timestamp.valueOf(LocalDateTime.now()));
        return houseRepository.save(house);
    }

    @Override
    public House findOne(Long id) {
        return houseRepository.findOne(id);
    }

    @Override
    public List<House> findTop3OrOrderByData(Timestamp data) {
        return houseRepository.findTop3OrOrderByData(data);
    }

    @Override
    public List<House> findAll() {
        return houseRepository.findAll();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
