package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: xsy
 * @create: 2020-06-11 14:26
 * 车牌类型实体
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Type extends BaseEntity {
    /**
     * 编号
     */
    private int id;
    /**
     * 类型名称
     */
    private String name;



}
