package com.build.service;

import com.build.model.Flat;
import com.build.repository.FlatRepository;

import java.util.List;

public interface FlatService {
    Flat save(Flat flat);

    Flat  findOne(Long id);

    List<Flat> findAll();

    boolean delete(Long id);
}
