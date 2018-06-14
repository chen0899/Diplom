package com.build.persistence.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @Column(columnDefinition = "LONGTEXT")
    private String image;

    @ManyToOne
    @JsonIgnore
    private House house;

    public Long getId() {
        return id;
    }

    public Image setId(Long id) {
        this.id = id;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Image setImage(String image) {
        this.image = image;
        return this;
    }

    public House getHouse() {
        return house;
    }

    public Image setHouse(House house) {
        this.house = house;
        return this;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", image='" + image + '\'' +
                '}';
    }
}
