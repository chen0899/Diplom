package com.build.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "LONGTEXT")
    private String information;

    @OneToMany
    private List<Flat> flats;

    @Column(columnDefinition = "LONGTEXT")
    private String image;

    public Long getId() {
        return id;
    }

    public House setId(Long id) {
        this.id = id;
        return this;
    }

    public String getInformation() {
        return information;
    }

    public House setInformation(String information) {
        this.information = information;
        return this;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public House setFlats(List<Flat> flats) {
        this.flats = flats;
        return this;
    }

    public String getImage() {
        return image;
    }

    public House setImage(String image) {
        this.image = image;
        return this;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", information='" + information + '\'' +
                ", flats=" + flats +
                ", image='" + image + '\'' +
                '}';
    }
}
