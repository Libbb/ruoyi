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

@ToString
public class Order extends BaseEntity {
    public Order(int orderId, String orderNum, String userPhone, String qSite, String hSite, String qTime, String hTime, Type vehicleNumType, Vehicle vehicleNum, int coverCharge, States orderStatus, double vehicleMoney, double vehicleCash, double vehicleOverdue, double vehicleReserve, double orderCost, String ifOverdue, String remark) {
        this.orderId = orderId;
        this.orderNum = orderNum;
        this.userPhone = userPhone;
        this.qSite = qSite;
        this.hSite = hSite;
        this.qTime = qTime;
        this.hTime = hTime;
        this.vehicleNumType = vehicleNumType;
        this.vehicleNum = vehicleNum;
        this.coverCharge = coverCharge;
        this.orderStatus = orderStatus;
        this.vehicleMoney = vehicleMoney;
        this.vehicleCash = vehicleCash;
        this.vehicleOverdue = vehicleOverdue;
        this.vehicleReserve = vehicleReserve;
        this.orderCost = orderCost;
        this.ifOverdue = ifOverdue;
        this.remark = remark;
    }

    public Order(){

    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getqSite() {
        return qSite;
    }

    public void setqSite(String qSite) {
        this.qSite = qSite;
    }

    public String gethSite() {
        return hSite;
    }

    public void sethSite(String hSite) {
        this.hSite = hSite;
    }

    public String getqTime() {
        return qTime;
    }

    public void setqTime(String qTime) {
        this.qTime = qTime;
    }

    public String gethTime() {
        return hTime;
    }

    public void sethTime(String hTime) {
        this.hTime = hTime;
    }

    public Type getVehicleNumType() {
        return vehicleNumType;
    }

    public void setVehicleNumType(Type vehicleNumType) {
        this.vehicleNumType = vehicleNumType;
    }

    public Vehicle getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(Vehicle vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public int getCoverCharge() {
        return coverCharge;
    }

    public void setCoverCharge(int coverCharge) {
        this.coverCharge = coverCharge;
    }

    public States getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(States orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getVehicleMoney() {
        return vehicleMoney;
    }

    public void setVehicleMoney(double vehicleMoney) {
        this.vehicleMoney = vehicleMoney;
    }

    public double getVehicleCash() {
        return vehicleCash;
    }

    public void setVehicleCash(double vehicleCash) {
        this.vehicleCash = vehicleCash;
    }

    public double getVehicleOverdue() {
        return vehicleOverdue;
    }

    public void setVehicleOverdue(double vehicleOverdue) {
        this.vehicleOverdue = vehicleOverdue;
    }

    public double getVehicleReserve() {
        return vehicleReserve;
    }

    public void setVehicleReserve(double vehicleReserve) {
        this.vehicleReserve = vehicleReserve;
    }

    public double getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(double orderCost) {
        this.orderCost = orderCost;
    }

    public String getIfOverdue() {
        return ifOverdue;
    }

    public void setIfOverdue(String ifOverdue) {
        this.ifOverdue = ifOverdue;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

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
    private Vehicle vehicleNum;
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
    private double  vehicleMoney;
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
