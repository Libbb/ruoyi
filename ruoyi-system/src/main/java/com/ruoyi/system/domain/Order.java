package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author: xsy
 * @create: 2020-06-15 15:39
 * 订单实体
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order extends BaseEntity {
    /**
     * 订单id
     */
    private int orderId;
    /**
     * 订单编号
     */
    private String orderNum;
    /**
     * 用户名
     */
    private String userPhone;
    /**
     * 取车地点
     */
    private String qSite;
    /**
     * 还车地点
     */
    private String hSite;
    /**
     * 取车时间
     */
    private String qTime;
    /**
     * 还车时间
     */
    private String hTime;
    /**
     * 车牌类型
     */
    private Type vehicleNumType;
    /**
     * 车牌号
     */
    private String vehicleNum;
    /**
     * 服务费
     */
    private int coverCharge;
    /**
     * 订单状态
     */
    private States orderStatus;
    /**
     * 周租金
     */
    private double  veghicleMoney;
    /**
     * 车辆押金费
     */
    private double vehicleCash;
    /**
     * 车辆逾期费
     */
    private double vehicleOverdue;
    /**
     * 车辆预定费
     */
    private double vehicleReserve;
    /**
     * 订单总费用
     */
    private double orderCost;
    /**
     * 是否逾期
     */
    private String ifOverdue;

    /**
     * 备注
     */
    private String remark;





}
