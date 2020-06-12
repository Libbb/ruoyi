package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.Client;
import com.ruoyi.system.mapper.ClientDao;
import com.ruoyi.system.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-12 15:32
 **/
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDao dao;

    @Override
    public List<Client> selectAll(Client client) {
        return dao.selectAll(client);
    }

    @Override
    public Client selectById(String userPhone) {
        return dao.selectById(userPhone);
    }
}
