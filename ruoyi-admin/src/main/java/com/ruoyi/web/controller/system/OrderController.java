package com.ruoyi.web.controller.system;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.constant.ScheduleConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.Order;
import com.ruoyi.system.domain.Vehicle;
import com.ruoyi.system.service.ISysPostService;
import com.ruoyi.system.service.VehicleService;
import com.ruoyi.system.service.impl.OrderServiceImpl;
import com.ruoyi.system.service.impl.VehicleServiceImpl;
import com.ruoyi.web.controller.tool.HttpUtil;

import org.apache.poi.ss.formula.functions.T;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.aspectj.weaver.ast.Or;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: xsy
 * @create: 2020-06-17 14:49
 **/

@Controller

@RequestMapping("/system/order")
public class OrderController extends BaseController {
    private String prefix = "system/order";


    @Autowired
    private ISysPostService postService;

    @Autowired
    private VehicleServiceImpl vs;
    @Autowired
    OrderServiceImpl os;

    @RequiresPermissions("system:order:view")
    @GetMapping()
    public String vehicle()
    {
        return prefix + "/order";
    }


    @RequiresPermissions("system:order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo selectAll(@RequestParam(required = false) @RequestBody Order order) {
        startPage();
        List<Order> list=os.selectAll(order);
        return getDataTable(list);
    }


    /**
     * 修改订单跳转
     */
    @GetMapping("/update")
    public String update(int id, ModelMap mmap)
    {
        Order order=new Order();
        mmap.put("order",order);
        return prefix + "/update";
    }


    /**
     * 修改保存
     * @param order 订单实体  订单状态3（）
     * @return
     */
    @Log(title = "订单管理", businessType = BusinessType.UPDATE)
    @RequiresPermissions("system:order:update")
    @PostMapping("/update")
    @ResponseBody
    public AjaxResult update(@RequestBody Order order){
        order.setUpdateBy(ShiroUtils.getLoginName());
        Vehicle vehicle=new Vehicle();
        if (order.getOrderStatus().getStatusId()==3){
            vehicle.setVehicleState("已出租");
            vs.vehicleUpdate(vehicle);

        }else if(order.getOrderStatus().getStatusId()==7){
            vehicle.setVehicleState("未出租");
            vs.vehicleUpdate(vehicle);
        }
        AjaxResult ajaxResult =toAjax(os.orderUpdate(order));



        return ajaxResult;
    }


    public Object timer(){
        //拿到可以查询违章的订单数据
        List<Order>list=os.selectCon();
        JSONObject json;
        for (int i=0;i<list.size();i++){
            json=HttpUtil.sendPost(list.get(i).getVehicleNum().getVehicleNum(),list.get(i).getVehicleNum().getVehicleVin(),list.get(i).getVehicleNum().getVehicleEngine(),list.get(i).getUserPhone());
            if(json==null){


            }
        }
        return null;

    }






}
