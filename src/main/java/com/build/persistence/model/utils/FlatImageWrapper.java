package com.build.persistence.model.utils;

public class FlatImageWrapper {
    private String image;
    private String floorImage;

    public String getImage() {
        return image;
    }

    public FlatImageWrapper setImage(String image) {
        this.image = image;
        return this;
    }

    public String getFloorImage() {
        return floorImage;
    }

    public FlatImageWrapper setFloorImage(String floorImage) {
        this.floorImage = floorImage;
        return this;
    }
}
