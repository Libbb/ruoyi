package com.ruoyi.system.service.impl;

import com.ruoyi.common.annotation.DataScope;
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
        return dao.selectAll();
    }
}
