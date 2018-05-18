package com.build.service.impl;

import com.build.model.House;
import com.build.repository.HouseRepository;
import com.build.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService{

    @Autowired
    private HouseRepository houseRepository;

    @Override
    public House save(House house) {
        return houseRepository.save(house);
    }

    @Override
    public House findOne(Long id) {
        return houseRepository.findOne(id);
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
