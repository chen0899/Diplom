package com.build.service;

import com.build.persistence.model.Image;

public interface ImageService {

    Image save (Image img);
    Image save (String img, Long id);
    Image findOne(Long id);

}
