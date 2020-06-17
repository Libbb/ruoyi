package com.ruoyi.web.controller.system;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.service.ISysPostService;
import com.ruoyi.system.service.ISysRoleService;
import com.ruoyi.web.controller.*;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.framework.web.domain.server.Sys;
import com.ruoyi.system.domain.Vehicle;
import com.ruoyi.system.service.impl.VehicleServiceImpl;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-11 11:27
 **/
@Controller
@RequestMapping("/system/vehicle")
public class VehicleController extends BaseController {
    private String prefix = "system/vehicle";

    @Autowired
    VehicleServiceImpl vs;
    

    @Autowired
    private ISysPostService postService;


    @RequiresPermissions("system:vehicle:view")
    @GetMapping()
    public String vehicle()
    {
        return prefix + "/vehicle";
    }


    @RequiresPermissions("system:vehicle:list")
    @PostMapping ("/list")
    @ResponseBody
    public TableDataInfo selectAll(@RequestParam(required = false) @RequestBody Vehicle vehicle) {
        startPage();
        List<Vehicle> list=vs.selectAll(vehicle);
        return getDataTable(list);
    }


    /**
     * 新增用户跳转
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存
     * @param vehicle 车辆实体
     * @return
     */
    @Log(title = "车辆管理", businessType = BusinessType.INSERT)
    @RequiresPermissions("system:vehicle:add")
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult vehicleAdd(@RequestBody Vehicle vehicle){
        vehicle.setCreateBy(ShiroUtils.getLoginName());
        return toAjax(vs.vehicelAdd(vehicle));
    }


    /**
     * 修改用户跳转
     */
    @GetMapping("/update")
    public String update(int id,ModelMap mmap)
    {
        Vehicle vehicle=vs.selectById(id);
        mmap.put("vehicle",vehicle);
        return prefix + "/update";
    }

    /**
     * 修改保存
     * @param vehicle 车辆实体
     * @return
     */
    @Log(title = "车辆管理", businessType = BusinessType.UPDATE)
    @RequiresPermissions("system:vehicle:update")
    @PostMapping("/update")
    @ResponseBody
    public AjaxResult update(@RequestBody Vehicle vehicle){
        vehicle.setUpdateBy(ShiroUtils.getLoginName());
        return toAjax(vs.vehicleUpdate(vehicle));
    }

    /**
     * 删除
     * @param id 车辆编号
     * @return
     */
    @Log(title = "车辆管理", businessType = BusinessType.DELETE)
    @RequiresPermissions("system:vehicle:delete")
    @PostMapping("/delete")
    @ResponseBody
    public AjaxResult delete(int id){
       return toAjax(vs.vahicleDelete(id));
    }


}
