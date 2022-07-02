package com.dominos.dominos.service;

import com.dominos.dominos.model.Dish;
import com.dominos.dominos.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    @Autowired
    private DishRepository dishRepository;

    @Autowired
    private AuthService authService;

    public void addDish(Dish dish){
        dishRepository.save(dish);
    }

    public void addAllDish(List<Dish> dishes){
        dishRepository.saveAll(dishes);
    }

    public List<Dish> getAllDishes(){
        return dishRepository.findAll();
    }

    public Dish getDishById(Long id){
        return dishRepository.findById(id).get();
    }

    public void delete(Long id){
        dishRepository.deleteById(id);
    }

    public  void update(Dish dish){
        dishRepository.save(dish);
    }
}
