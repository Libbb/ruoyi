package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: xsy
 * @create: 2020-06-17 16:52
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Branch extends BaseEntity {
    /**
     * 网点编号
     */
    private int id;
    /**
     * 网点名称
     */
    private String branchSite;
}
