package com.build.persistence.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Flat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @Column(columnDefinition = "LONGTEXT")
    private String image;

    private Double price;

    @JsonIgnore
    @ManyToOne
    private House house;

    public Long getId() {
        return id;
    }

    public Flat setId(Long id) {
        this.id = id;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Flat setImage(String image) {
        this.image = image;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Flat setPrice(Double price) {
        this.price = price;
        return this;
    }

    public House getHouse() {
        return house;
    }

    public Flat setHouse(House house) {
        this.house = house;
        return this;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", house=" + house +
                '}';
    }
}
