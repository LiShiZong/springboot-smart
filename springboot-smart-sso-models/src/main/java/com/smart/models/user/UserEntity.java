package com.smart.models.user;

import lombok.Data;

import java.util.Date;

@Data
public class UserEntity {

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 机构id
     */
    private Integer officeId;

    /**
     *姓名
     */
    private String userName;

    /**
     *登录名
     */
    private String account;

    /**
     *密码
     */
    private String password;

    /**
     *最后登录ip
     */
    private String lastLoginIp;

    /**
     *最后登录时间
     */
    private Date lastLoginTime;

    /**
     *登录总次数
     */
    private Integer loginCount;

    /**
     *创建时间
     */
    private Date createTime;

    /**
     *是否启用
     */
    private Integer isEnable;

}
