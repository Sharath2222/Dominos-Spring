package com.dominos.dominos.model;

import com.dominos.dominos.dto.CartDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ordered_items")
public class OrderedItems {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "order_id")
    private Long orderId;
    private String username;
    private String dishName;
    private Integer quantity;
    private Long price;

    public OrderedItems(CartDto cartDto){

        this.username=cartDto.getUsername();
        this.dishName=cartDto.getDishName();
        this.quantity=cartDto.getQuantity();
        this.price=cartDto.getPrice();
    }
}
