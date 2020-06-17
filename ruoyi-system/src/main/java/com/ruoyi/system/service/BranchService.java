package com.ruoyi.system.service;

import com.ruoyi.system.domain.Branch;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-17 16:55
 **/

public interface BranchService {
    /**
     * 查询所有网点
     * @return 网点集合
     */
    public List<Branch> selectAll();

    /**
     * 删除
     * @param id
     * @return
     */
    public int delete(int id);

    /**
     * 添加网点
     * @param branch
     * @return
     */
    public int add(Branch branch);

    /**
     * 根据id查询网点
     * @param id
     * @return
     */
    public Branch selectById(int id);

    /**
     * 修改网点
     * @param branch
     * @return
     */
    public int update(Branch branch);

}
