package com.dominos.dominos.service;

import com.dominos.dominos.dto.CartDto;
import com.dominos.dominos.dto.OrderedItemsDto;
import com.dominos.dominos.model.Order;
import com.dominos.dominos.model.OrderedItems;
import com.dominos.dominos.repository.OrderRepository;
import com.dominos.dominos.repository.OrderedItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderedItemsRepository orderedItemsRepository;

    public void createOrder(List<CartDto> cartItems) {
        Order order1 = new Order();

        long price = 0;
        for(CartDto cartItem:cartItems){
            price+=cartItem.getPrice()*cartItem.getQuantity();
        }
        order1.setTotalPrice(price);
        order1.setCreatedDate(new Date());
        order1 = orderRepository.save(order1);
        long orderId = order1.getId();
        orderRepository.flush();
        for (CartDto cartItem : cartItems) {
            OrderedItems orderedItem = new OrderedItems(cartItem);
            orderedItem.setOrderId(orderId);
            orderedItemsRepository.save(orderedItem);
        }
    }

    public List<OrderedItems> getAllOrders(String username) {
        return orderedItemsRepository.findAll().stream().filter(order->order.getUsername().equals(username)).toList();
    }
}
