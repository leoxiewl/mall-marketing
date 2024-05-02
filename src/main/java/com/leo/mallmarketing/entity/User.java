package com.leo.mallmarketing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 性别 0-未知，1-男，2-女
     */
    private Integer gender;

    /**
     * 用户角色：0-普通用户, 1-管理员
     */
    private Integer userRole;

    /**
     * 是否删除
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
