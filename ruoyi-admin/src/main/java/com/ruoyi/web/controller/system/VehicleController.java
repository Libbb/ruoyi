package com.ruoyi.web.controller.system;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.web.controller.*;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.framework.web.domain.server.Sys;
import com.ruoyi.system.domain.Vehicle;
import com.ruoyi.system.service.impl.VehicleServiceImpl;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-11 11:27
 **/
@RestController
@RequestMapping("/system/vehicle")
public class VehicleController extends BaseController {


    @Autowired
    VehicleServiceImpl vs;

    @RequiresPermissions("system:vehicle:list")
    @GetMapping ("/list")
    public TableDataInfo selectAll( Vehicle vehicle) {
        startPage();
        List<Vehicle> list=vs.selectAll(vehicle);
        return getDataTable(list);
    }



}
