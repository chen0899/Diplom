package com.build.service.impl;

import com.build.persistence.model.Flat;
import com.build.persistence.repository.FlatRepository;
import com.build.service.FlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlatServiceImpl implements FlatService{

    @Autowired
    private FlatRepository flatRepository;

    @Override
    public Flat save(Flat flat) {
        return flatRepository.save(flat);
    }

    @Override
    public Flat findOne(Long id) {
        return flatRepository.findOne(id);
    }

    @Override
    public List<Flat> findAll() {
        return flatRepository.findAll();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
