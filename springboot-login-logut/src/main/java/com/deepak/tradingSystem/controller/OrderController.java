package com.deepak.tradingSystem.controller;

import com.deepak.tradingSystem.bean.Order;
import com.deepak.tradingSystem.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @Autowired
    OrderServiceImpl orderService;

    @PostMapping ("/orderPlace")
    public ResponseEntity<Long> orderPlace (@RequestBody Order order){

        System.out.println("I do not know");
       // Order order= new Order();
        Long orderId=orderService.orderPlace(order);

        if(orderId>0){
         return new ResponseEntity<Long>(orderId,HttpStatus.ACCEPTED);
        }
       return new ResponseEntity<Long>(HttpStatus.ACCEPTED);

    }
}
