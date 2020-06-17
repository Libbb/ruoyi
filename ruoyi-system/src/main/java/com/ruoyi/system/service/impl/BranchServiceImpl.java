package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.Branch;
import com.ruoyi.system.mapper.BranchDao;
import com.ruoyi.system.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-17 16:57
 **/

@Service
public class BranchServiceImpl implements BranchService {
    @Autowired
    BranchDao dao;

    @Override
    public List<Branch> selectAll() {
        return dao.selectAll();
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public int add(Branch branch) {
        return dao.add(branch);
    }

    @Override
    public Branch selectById(int id) {
        return dao.selectById(id);
    }

    @Override
    public int update(Branch branch) {
        return dao.update(branch);
    }
}
