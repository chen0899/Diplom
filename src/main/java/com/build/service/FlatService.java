package com.build.service;

import com.build.persistence.model.Flat;

import java.util.List;

public interface FlatService {
    Flat save(Flat flat);

    Flat  findOne(Long id);

    List<Flat> findAll();

    boolean delete(Long id);
}
