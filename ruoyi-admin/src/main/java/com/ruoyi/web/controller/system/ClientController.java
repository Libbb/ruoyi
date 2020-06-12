package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.Client;
import com.ruoyi.system.service.impl.ClientServiceImpl;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-12 15:42
 **/
@Controller
@RequestMapping("system/client")
public class ClientController extends BaseController {
    private String prefix = "system/client";

    @Autowired
    ClientServiceImpl cs;

    @RequiresPermissions("system:client:view")
    @GetMapping()
    public String vehicle() {
        return prefix + "/client";
    }

    @RequiresPermissions("system:client:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo selectAll(Client client) {
        startPage();
        List<Client> list = cs.selectAll(client);
        return getDataTable(list);
    }



    /**
     * 查看
     */
    @PostMapping("/look")
    public String look(String userPhone, ModelMap mmp) {
        mmp.put("client",cs.selectById(userPhone));
        return prefix + "/add";
    }

}
