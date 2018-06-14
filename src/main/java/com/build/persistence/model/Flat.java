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

    @JsonIgnore
    @Column(columnDefinition = "LONGTEXT")
    private String imageFloor;


    private Double price;

    private Integer space;

    private Double priceForOneSpace;

    private Integer countRoom;

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

    public Integer getSpace() {
        return space;
    }

    public Flat setSpace(Integer space) {
        this.space = space;
        return this;
    }

    public Double getPriceForOneSpace() {
        return priceForOneSpace;
    }

    public Flat setPriceForOneSpace(Double priceForOneSpace) {
        this.priceForOneSpace = priceForOneSpace;
        return this;
    }

    public int getCountRoom() {
        return countRoom;
    }

    public Flat setCountRoom(int countRoom) {
        this.countRoom = countRoom;
        return this;
    }

    public String getImageFloor() {
        return imageFloor;
    }

    public Flat setImageFloor(String imageFloor) {
        this.imageFloor = imageFloor;
        return this;
    }

    public Flat setCountRoom(Integer countRoom) {
        this.countRoom = countRoom;
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
