package com.ruoyi.system.service;

import com.ruoyi.system.domain.Client;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-12 15:31
 **/

public interface ClientService {

    /**
     * 条件分页查询
     * @param client
     * @return
     */
    public List<Client> selectAll(Client client);

    /**
     * 根据用户名查询用户详细信息
     * @param userPhone
     * @return
     */
    public Client selectById(String userPhone);
}
