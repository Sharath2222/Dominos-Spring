package com.dominos.dominos.repository;

import com.dominos.dominos.model.OrderedItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrderedItemsRepository extends JpaRepository<OrderedItems,Long> {
    /*Optional<List<OrderedItems>> findByItems(String username);*/
    /*Collection<OrderedItems> getOrderItems(String username);*/
}
