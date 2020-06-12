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

    /**
     * 添加车辆
     * @param vehicle 车辆
     * @return res
     */
    public int vehicelAdd(Vehicle vehicle);


    /**
     * 修改车辆信息
     * @param vehicle 车辆实体
     * @return res
     */
    public int vehicleUpdate(Vehicle vehicle);

    /**
     * 通过车辆编号查询车辆信息
     * @param id 编号
     * @return 车辆实体
     */
    public Vehicle selectById(int id);

    /**
     * 删除
     * @param id 车辆编号
     * @return res
     */
    public int vahicleDelete(int id);

}
