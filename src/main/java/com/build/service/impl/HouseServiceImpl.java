package com.build.service.impl;

import com.build.persistence.model.House;
import com.build.persistence.repository.HouseRepository;
import com.build.service.FlatService;
import com.build.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseRepository houseRepository;
    @Autowired
    private FlatService flatService;

    @Override
    public House save(House house) {
        house.setId(houseRepository.save(house).getId());
        house.setData(Timestamp.valueOf(LocalDateTime.now()));
        house.setFlats(house.getFlats().stream().map(flat -> flatService.save(flat.setHouse(house))).collect(Collectors.toList()));
        return houseRepository.save(house);
    }

    @Override
    public House findOne(Long id) {
        return houseRepository.findOne(id);
    }

    @Override
    public List<House> findTop3OrOrderByData() {
        return houseRepository.findTop3ByOrderByDataDesc();
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
