package com.build.service;

import com.build.model.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {

    User save(User user, MultipartFile multipartFile);

    User findOne(Long id);

    List<User> findByName(String name);

    User findByEmail(String email);

    List<User> findAll();

    Boolean delete(Long id);
}
