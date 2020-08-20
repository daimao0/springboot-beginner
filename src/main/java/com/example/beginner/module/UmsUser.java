package com.example.beginner.module;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 呆毛
 */
@Data
@TableName(value = "ums_user")
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UmsUser {
    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "ums_id",type = IdType.AUTO)//指定自增策略
    private Long id;

    @TableField(value = "ums_username")
    private String username;

    @TableField(value = "ums_password")
    private String password;

    @TableField(value = "ums_nickname")
    private String nickname;

    @TableField(value = "ums_phone")
    private String phone;

    @TableField(value = "ums_email")
    private String email;

    @TableField(value = "ums_role")
    private String role;
}