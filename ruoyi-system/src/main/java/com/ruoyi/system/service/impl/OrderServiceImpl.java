package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.Order;
import com.ruoyi.system.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-17 14:34
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderService os;


    @Override
    public List<Order> selectAll(Order order){
        return os.selectAll(order);
    }

    @Override
    public Order selectById(int id) {
        return os.selectById(id);
    }

    @Override
    public int orderUpdate(Order order) {
        return os.orderUpdate(order);
    }
}
