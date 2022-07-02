package com.dominos.dominos.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CartDto {
    private String username;
    private String dishName;
    private Integer quantity;
    private Long price;
}
