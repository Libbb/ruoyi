package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.Order;
import com.ruoyi.system.mapper.OrderDao;
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
    OrderDao dao;


    @Override
    public List<Order> selectAll(Order order){
        return dao.selectAll(order);
    }

    @Override
    public Order selectById(int id) {
        return dao.selectById(id);
    }

    @Override
    public int orderUpdate(Order order) {
        return dao.orderUpdate(order);
    }

    @Override
    public List<Order> intraDay() {
        return dao.intraDay();
    }
}
