package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Branch;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-17 16:54
 **/
@Mapper
public interface BranchDao {
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
