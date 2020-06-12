package com.ruoyi.system.domain;

import lombok.*;

/**
 * @author: xsy
 * @create: 2020-06-12 15:09
 * 用户实体
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client {
    /**
     * 用户名
     */
    private String userPhone;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 身份证号
     */
    private String userId;
    /**
     * 驾驶证号
     */
    private String drivId;
    /**
     * 身份证正面照
     */
    private String idPhoto;
    /**
     * 身份证反面照
     */
    private String idPicture;

}
