package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Protocol;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-12 13:41
 * 持久层
 **/
@Mapper
public interface ProtocolDao {
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

}
