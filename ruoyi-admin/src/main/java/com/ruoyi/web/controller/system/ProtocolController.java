package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.Protocol;
import com.ruoyi.system.domain.Vehicle;
import com.ruoyi.system.service.impl.ProtocolServiceImpl;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-12 14:18
 **/
@Controller
@RequestMapping("/system/protocol")
public class ProtocolController extends BaseController {
    private String prefix = "system/protocol";

    @Autowired
    ProtocolServiceImpl ps;

    @RequiresPermissions("system:protocol:view")
    @GetMapping()
    public String vehicle() {
        return prefix + "/protocol";
    }

    @RequiresPermissions("system:protocol:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo selectAll() {
        startPage();
        List<Protocol> list = ps.selectAll();
        return getDataTable(list);
    }


    /**
     * 新增用户跳转
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存
     *
     * @param protocol 协议实体
     * @return
     */
    @RequiresPermissions("system:protocol:add")
    @PostMapping("/add")
    @ResponseBody
    public int protocolAdd(@RequestBody Protocol protocol) {
        return ps.protocolAdd(protocol);
    }


    /**
     * 修改用户跳转
     */
    @GetMapping("/update")
    public String update() {
        return prefix + "/update";
    }

    /**
     * 修改保存
     *
     * @param protocol 协议实体
     * @return
     */
    @RequiresPermissions("system:protocol:update")
    @PostMapping("/update")
    @ResponseBody
    public int update(@RequestBody Protocol protocol) {
        return ps.protocolUpdate(protocol);
    }

    /**
     * 删除
     *
     * @param id 协议编号
     * @return
     */
    @RequiresPermissions("system:protocol:delete")
    @PostMapping("/delete")
    @ResponseBody
    public int delete(int id) {
        return ps.delete(id);
    }


}
