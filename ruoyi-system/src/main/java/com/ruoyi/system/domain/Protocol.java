package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.*;

/**
 * @author: xsy
 * @create: 2020-06-12 13:36
 * 协议实体类
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Protocol extends BaseEntity {
    /**
     * 协议编号
     */
    private int id;
    /**
     * 协议名称
     */
    private String protocolName;
    /**
     * 协议内容
     */
    private String protocolContent;



}
