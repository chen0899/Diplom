package com.build.service.impl;

import com.build.persistence.model.User;
import com.build.persistence.model.enums.Role;
import com.build.persistence.repository.UserRepository;
import com.build.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User save(User user) {
        return userRepository.save(user.setPassword(passwordEncoder.encode(user.getPassword())).setRole(Role.DEFAULT));
    }

    @Override
    public User findOne(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<User> findByName(String name) {
        return userRepository.findAllByName(name);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
