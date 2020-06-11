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
     * @return 车辆集合
     */
    public List<Vehicle> selectAll();

}
