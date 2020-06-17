package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;


/**
 * @author: xsy
 * @create: 2020-06-15 16:59
 **/
@Mapper
public interface OrderDao {
    /**
     * 根据条件查询订单信息
     * @param order 查询条件
     * @return
     */
    public List<Order> selectAll(Order order);

    /**
     * 根据编号查询订单详情
     * @param id
     * @return
     */
    public Order selectById(int id);

    /**
     * 修改订单状态 及租金
     * @param order
     * @return
     */
    public int orderUpdate(Order order);


}
