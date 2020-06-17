package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.Protocol;
import com.ruoyi.system.mapper.ProtocolDao;
import com.ruoyi.system.service.ProtocolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-12 13:48
 **/
@Service
public class ProtocolServiceImpl implements ProtocolService {
    @Autowired
    ProtocolDao dao;

    @Override
    public List<Protocol> selectAll() {
        return dao.selectAll();
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public int protocolAdd(Protocol protocol) {
        return dao.protocolAdd(protocol);
    }

    @Override
    public int protocolUpdate(Protocol protocol) {
        return dao.protocolUpdate(protocol);
    }

    @Override
    public Protocol selectById(int id) {
        return dao.selectById(id);
    }

    @Override
    public int proDeletes(String ids) throws Exception {
        Long[] id = Convert.toLongArray(ids);
        return dao.prolDeletes(id);
    }
}
