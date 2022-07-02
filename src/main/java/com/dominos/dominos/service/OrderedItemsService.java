package com.dominos.dominos.service;

import com.dominos.dominos.repository.OrderedItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderedItemsService {

    @Autowired
    private OrderedItemsRepository orderedItemsRepository;
}
