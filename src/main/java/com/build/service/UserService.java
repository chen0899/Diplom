package com.build.service;

import com.build.persistence.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    User findOne(Long id);

    List<User> findByName(String name);

    User findByEmail(String email);

    List<User> findAll();

    Boolean delete(Long id);

    Boolean makeAdmin (Long id);
}
