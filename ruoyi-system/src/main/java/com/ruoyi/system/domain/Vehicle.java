package com.ruoyi.system.domain;

import lombok.*;

import java.math.BigDecimal;

/**
 * @author: xsy
 * @create: 2020-06-11 11:06
 * 车辆实体类
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vehicle {
    /**
     * 车辆编号
     */
    private int id;
    /**
     * 车辆车牌
     */
    private String vehicleNum;
    /**
     * 车辆品牌型号
     */
    private String vehicleModel;
    /**
     * 车牌类型
     */
    private Type vehicleNumType;
    /**
     * 周租的价格
     */
    private BigDecimal vehiclePrice;
    /**
     * 车辆标签、特点
     */
    private String vehicleLabel;

    /**
     * 车辆预定位
     */
    private BigDecimal vehicleReserve;
    /**
     * 车辆押金
     */
    private BigDecimal vehicleCash;
    /**


     * 车辆逾期费
     */
    private BigDecimal vehicleOverdue;
    /**
     * 车辆状态
     */
    private String vehicleState;

    /**
     * 车辆照片
     */
    private String vehiclePhoto;

    /**
     * 车架号
     */
    private String vehicleVin;
    /**
     * 发动机号
     */
    private String vehicleEngine;

}
