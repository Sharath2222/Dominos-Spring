package com.dominos.dominos.dto;


import com.dominos.dominos.model.OrderedItems;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderedItemsDto {


    private Long orderId;

    private String dishName;
    private  Integer quantity;
    private Long price;

    public OrderedItemsDto(OrderedItems orderedItems){
        this.orderId=orderedItems.getOrderId();
        this.dishName=orderedItems.getDishName();
        this.quantity=orderedItems.getQuantity();
        this.price=orderedItems.getPrice();
    }
}
