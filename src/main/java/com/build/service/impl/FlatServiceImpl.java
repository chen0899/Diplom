package com.build.service.impl;

import com.build.repository.FlatRepository;
import com.build.service.FlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlatServiceImpl implements FlatService{

    @Autowired
    private FlatRepository flatRepository;

    @Override
    public FlatRepository save(FlatRepository flat) {
        return flatRepository.save(flat);
    }

    @Override
    public FlatRepository findOne(Long id) {
        return flatRepository.findOne(id);
    }

    @Override
    public List<FlatRepository> findAll() {
        return flatRepository.findAll();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
