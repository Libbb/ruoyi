package com.ruoyi.web.controller.system;


import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.Order;
import com.ruoyi.system.domain.States;
import com.ruoyi.system.service.ISysPostService;
import com.ruoyi.system.service.impl.OrderServiceImpl;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.aspectj.weaver.tools.cache.CacheBacking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-18 11:18
 **/

@Controller
public class OrderDayController extends BaseController {
    private String prefix = "system/day";

    @Autowired
    private ISysPostService postService;

    @Autowired
    OrderServiceImpl os;


    @RequiresPermissions("system:day:view")
    @GetMapping()
    public String vehicle() {
        return prefix + "/day";
    }

    @RequiresPermissions("system:day:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo selectAll() throws ParseException {
        startPage();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        Calendar car2 = Calendar.getInstance();
        Calendar car3 = Calendar.getInstance();
        States states = new States();
        //当天还车的数据
        List<Order> list = os.intraDay();
        //循环当天还车数据
        for (int i = 0; i < list.size(); i++) {
            //拿到还车时间 转换为date格式
            Date date = sdf.parse(list.get(i).getHTime());
            cal.setTime(date);
            //当前还车时间加上4小时
            cal.add(Calendar.HOUR_OF_DAY, 4);
            car2.setTime(date);
            //当前还车时间加上8小时
            car2.add(Calendar.HOUR_OF_DAY, 8);
            //判断还车时间是否超过当前时间 及逾期字段是否为空
            if (cal.getTime().before(new Date()) && list.get(i).getIfOverdue() == null) {
                //逾期费为车辆日租金一半
                list.get(i).setVehicleOverdue(list.get(i).getVeghicleMoney() / 2);
                //是否逾期自动赋值
                list.get(i).setIfOverdue("是");
                //订单状态赋值
                states.setStatusId(6);
                list.get(i).setRemark("逾期4小时，逾期费用为日租金一半");
                list.get(i).setOrderStatus(states);
                //修改订单
                os.orderUpdate(list.get(i));
                //判断还车时间是否超过8小时 及逾期字段不为空
            } else if (cal.getTime().before(new Date()) && list.get(i).getIfOverdue() != null) {
                //订单状态赋值
                states.setStatusId(4);
                //逾期费赋值 车日租费
                list.get(i).setVehicleOverdue(list.get(i).getVeghicleMoney());
                //拿到还车时间 转换为date格式
                Date date2 = sdf.parse(list.get(i).getHTime());
                //备注 原还车时间 对比现还车时间 便可知道续租几天。
                list.get(i).setRemark("原还车时间为："+date2);
                car3.setTime(date2);
                car3.add(Calendar.DATE, 1);
                date2 = car3.getTime();
                //还车时间往后延1天
                list.get(i).setHTime(date2.toString());
                //更改订单状态
                os.orderUpdate(list.get(i));
            }
        }
        return getDataTable(list);
    }





}
