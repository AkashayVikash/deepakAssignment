package com.deepak.tradingSystem.service;

import com.deepak.tradingSystem.bean.Order;
import com.deepak.tradingSystem.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl {

    @Autowired
    OrderRepository orderRepository;

    public Long orderPlace(Order order){

      return orderRepository.save(order).getOrder_id();
    }
}
