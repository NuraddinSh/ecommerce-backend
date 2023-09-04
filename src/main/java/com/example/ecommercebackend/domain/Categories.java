package com.example.ecommercebackend.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "categories")
public class Categories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="categories_id_seq")
    @SequenceGenerator(name="categories_id_seq", sequenceName="categories_id_seq", allocationSize=1)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "active")
    private boolean active;

    public Categories() {
    }

    public Categories(Long id, String name, boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }

    public Categories(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                '}';
    }


}
