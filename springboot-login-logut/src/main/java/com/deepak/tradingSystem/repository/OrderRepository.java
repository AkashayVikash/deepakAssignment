package com.deepak.tradingSystem.repository;

import com.deepak.tradingSystem.bean.Order;
import com.deepak.tradingSystem.bean.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends CrudRepository<Order, Long> {

}

