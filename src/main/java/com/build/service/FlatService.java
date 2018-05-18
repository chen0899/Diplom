package com.build.service;

import com.build.repository.FlatRepository;

import java.util.List;

public interface FlatService {
    FlatRepository save(FlatRepository flat);

    FlatRepository findOne(Long id);

    List<FlatRepository> findAll();

    boolean delete(Long id);
}
