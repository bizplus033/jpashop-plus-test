package com.study.jpashop.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UpdateItemForm {

    private Long id;
    private String name;
    private int price;
    private int stockQuantity;
}
