package com.ruoyi.system.service.impl;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.domain.Vehicle;
import com.ruoyi.system.mapper.VehicleDao;
import com.ruoyi.system.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-11 11:21
 * 业务层
 **/
@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    VehicleDao dao;


    @Override
    @DataScope(deptAlias = "d", userAlias = "u")
    public List<Vehicle> selectAll(Vehicle vehicle) {
        return dao.selectAll(vehicle);
    }

    @Override
    public int vehicelAdd(Vehicle vehicle) {
        return dao.vehicelAdd(vehicle);
    }

    @Override
    public int vehicleUpdate(Vehicle vehicle) {
        return dao.vehicleUpdate(vehicle);
    }

    @Override
    public Vehicle selectById(int id) {
        return dao.selectById(id);
    }

    @Override
    public int vahicleDelete(int id) {
        return dao.vahicleDelete(id);
    }

    @Override
    public int vehicleDeletes(String ids) throws Exception {
        Long[] id = Convert.toLongArray(ids);
        return dao.vehicleDeletes(id);
    }


}
