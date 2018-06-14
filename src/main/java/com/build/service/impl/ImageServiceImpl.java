package com.build.service.impl;

import com.build.persistence.model.Image;
import com.build.persistence.repository.ImageRepository;
import com.build.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageRepository imageRepository;

    @Override
    public Image findOne(Long id) {
        return imageRepository.findOne(id);
    }

    @Override
    public Image save(Image img) {
        return imageRepository.save(img);
    }
}
