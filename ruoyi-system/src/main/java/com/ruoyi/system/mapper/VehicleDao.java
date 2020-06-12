package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Vehicle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-11 11:18
 * 持久层
 **/
@Mapper
public interface VehicleDao {
    /**
     * 查询所有车辆
     * @param vehicle 车辆实体
     * @return 车辆集合
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
