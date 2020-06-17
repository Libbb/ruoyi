package com.ruoyi.system.service;

import com.ruoyi.system.domain.Protocol;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-12 13:48
 *业务层
 **/

public interface ProtocolService {
    /**
     * 查询所有
     * @return 协议集合
     */
    public List<Protocol> selectAll();

    /**
     * 删除
     * @param id 编号
     * @return
     */
    public int delete(int id);

    /**
     * 添加
     * @param protocol 协议实体
     * @return
     */
    public int protocolAdd(Protocol protocol);

    /**
     * 修改
     * @param protocol 协议实体
     * @return
     */
    public int protocolUpdate(Protocol protocol);

    /**
     * 根据编号查询
     * @param id
     * @return
     */
    public Protocol selectById(int id);

    /**
     * 批量删除车辆信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     * @throws Exception 异常
     */
    public int proDeletes(String ids) throws Exception;

}
