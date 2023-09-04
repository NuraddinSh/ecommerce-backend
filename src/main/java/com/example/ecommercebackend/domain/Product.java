package com.example.ecommercebackend.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_id_seq")
    @SequenceGenerator(name="product_id_seq", sequenceName="product_id_seq", allocationSize=1)
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Float price;
    @Column(name = "active")
    private boolean active;

    @Column(name = "image")
    private String image;


    @ManyToOne
    CategoryDetail categoryDetail;

    public Product() {
    }

    public Product(Long id, String name, boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }

    public Product(String name, boolean active) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CategoryDetail getCategoryDetail() {
        return categoryDetail;
    }

    public void setCategoryDetail(CategoryDetail categoryDetail) {
        this.categoryDetail = categoryDetail;
    }
}
