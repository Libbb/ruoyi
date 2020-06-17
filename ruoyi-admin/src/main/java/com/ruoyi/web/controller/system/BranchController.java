package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.Branch;
import com.ruoyi.system.domain.Vehicle;
import com.ruoyi.system.service.ISysPostService;
import com.ruoyi.system.service.impl.BranchServiceImpl;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-17 17:14
 **/

@Controller
@RequestMapping("/system/branch")
public class BranchController extends BaseController {
    private String prefix = "system/branch";

    @Autowired
    BranchServiceImpl bs;

    @Autowired
    private ISysPostService postService;

    @RequiresPermissions("system:branch:view")
    @GetMapping()
    public String vehicle()
    {
        return prefix + "/branch";
    }

    @RequiresPermissions("system:branch:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo selectAll() {
        startPage();
        List<Branch> list=new ArrayList<>();
        list=bs.selectAll();
        return getDataTable(list);
    }


    /**
     * 新增网点跳转
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存
     * @param branch 网点实体
     * @return
     */
    @Log(title = "网点管理", businessType = BusinessType.INSERT)
    @RequiresPermissions("system:branch:add")
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult vehicleAdd(@RequestBody Branch branch){
        branch.setCreateBy(ShiroUtils.getLoginName());
        return toAjax(bs.add(branch));
    }


    /**
     * 修改网点跳转
     */
    @GetMapping("/update")
    public String update(int id, ModelMap mmap)
    {
       Branch branch=bs.selectById(id);
        mmap.put("branch",branch);
        return prefix + "/update";
    }

    /**
     * 修改保存
     * @param branch 修改网点
     * @return
     */
    @Log(title = "车辆管理", businessType = BusinessType.UPDATE)
    @RequiresPermissions("system:branch:update")
    @PostMapping("/update")
    @ResponseBody
    public AjaxResult update(@RequestBody Branch branch){
        branch.setUpdateBy(ShiroUtils.getLoginName());
        return toAjax(bs.update(branch));
    }

    /**
     * 删除
     * @param id 网点编号
     * @return
     */
    @Log(title = "网点管理", businessType = BusinessType.DELETE)
    @RequiresPermissions("system:branch:delete")
    @PostMapping("/delete")
    @ResponseBody
    public AjaxResult delete(int id){
        return toAjax(bs.delete(id));
    }



}
