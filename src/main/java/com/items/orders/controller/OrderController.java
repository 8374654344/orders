package com.items.orders.controller;

import com.items.orders.entity.Orders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderController {
    @GetMapping("/orders")
    public int getOrders(){
        return 0;
    }
    @PostMapping("/orders")
    public Orders saveOrders(@RequestBody Orders orders){
        return orders;
    }
}
