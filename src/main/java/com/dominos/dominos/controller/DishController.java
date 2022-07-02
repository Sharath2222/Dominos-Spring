package com.dominos.dominos.controller;

import com.dominos.dominos.model.Dish;
import com.dominos.dominos.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(
        origins = {"http://localhost:4200/"}   ,
        /*    allowCredentials = "true",

        allowedHeaders = {"*"},
        exposedHeaders = {"*"},
        maxAge = 60 * 30,*/
        methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})



@RequestMapping("/api/order")
public class DishController {
    @Autowired
    private DishService dishService;

    @PostMapping("/add")
    public ResponseEntity addProduct(@RequestBody Dish dish) {
        dishService.addDish(dish);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Dish>> gelAllProducts() {
        return new ResponseEntity<>(dishService.getAllDishes(),HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Dish> getProductById(@PathVariable Long id) {
        return new ResponseEntity<>(dishService.getDishById(id),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody Dish dish) {
        dishService.update(dish);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        dishService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
