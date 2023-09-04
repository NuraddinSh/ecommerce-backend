package com.example.ecommercebackend.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "category_detail")
public class CategoryDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="category_main_id_seq")
    @SequenceGenerator(name="category_main_id_seq", sequenceName="category_main_id_seq", allocationSize=1)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "active")
    private boolean active;

    @ManyToOne
    CategoryMain categoryMain;

    public CategoryDetail() {
    }

    public CategoryDetail(Long id, String name, boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }

    public CategoryDetail(String name, boolean active) {
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

    public CategoryMain getCategoryMain() {
        return categoryMain;
    }

    public void setCategoryMain(CategoryMain categoryMain) {
        this.categoryMain = categoryMain;
    }



}
