package com.ruoyi.system.service;

import com.ruoyi.system.domain.Vehicle;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-11 11:21
 **/

public interface VehicleService {
    /**
     * 根据条件分页
     * @param vehicle 条件
     * @return 车辆列表
     */
    public List<Vehicle> selectAll(Vehicle vehicle);

}
