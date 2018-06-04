package com.build.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "LONGTEXT")
    private String information;

    @OneToMany(mappedBy = "house")
    private List<Flat> flats;

    @Column(columnDefinition = "LONGTEXT")
    private String image;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Timestamp data;

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

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
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
