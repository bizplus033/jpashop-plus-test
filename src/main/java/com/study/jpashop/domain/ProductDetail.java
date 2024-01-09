package com.study.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "product_detail")
public class ProductDetail {
    @Id
    @GeneratedValue
    @Column(name = "product_detail_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "child")
    private List<ProductDetailConn> children = new ArrayList<>();

    @OneToMany(mappedBy = "parent")
    private List<ProductDetailConn> parents = new ArrayList<>();
}
