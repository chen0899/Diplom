package com.build.persistence.model;

import com.build.persistence.model.enums.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Entity
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String password;
    private Boolean available = true;
    @Column(columnDefinition = "LONGTEXT")
    private String information;
    @Column(columnDefinition = "LONGTEXT")
    private String image;
    private Role role;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public User setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Boolean getAvailable() {
        return available;
    }

    public User setAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    public String getInformation() {
        return information;
    }

    public User setInformation(String information) {
        this.information = information;
        return this;
    }

    public String getImage() {
        return image;
    }

    public User setImage(String image) {
        this.image = image;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public User setRole(Role role) {
        this.role = role;
        return this;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(role.name().toUpperCase()));
        return grantedAuthorities;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return available;
    }

    @Override
    public boolean isAccountNonLocked() {
        return available;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return available;
    }

    @Override
    public boolean isEnabled() {
        return available;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", information='" + information + '\'' +
                ", password='" + password + '\'' +
                ", image='" + image + '\'' +
                ", available=" + available +
                '}';
    }
}