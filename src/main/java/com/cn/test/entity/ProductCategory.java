package com.cn.test.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="product_category")
@Data
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;

}







