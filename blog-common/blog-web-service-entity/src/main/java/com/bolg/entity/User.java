package com.bolg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
* @author : HY
* @version : V1.0
* @ClassName : User
* @Description:
* @date : 2022-1-5 11:19:21
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_user")
@ApiModel(value="User对象", description="用户表")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @ApiModelProperty(value = "账号")
    private Long account;

    @ApiModelProperty(value = "姓名")
    private String userName;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "手机号")
    private Long phoneNumber;

    @ApiModelProperty(value = "性别  0:男 1：女 ")
    private Integer gender;

    @ApiModelProperty(value = "邮箱")
    private String mailbox;

    @ApiModelProperty(value = "微信号")
    private String wechatNumber;

    @ApiModelProperty(value = "生日")
    private LocalDate birthday;

    @ApiModelProperty(value = "籍贯")
    private String origin;

    @ApiModelProperty(value = "民族表的ID,默认为汉族")
    private Integer nationalId;

    @ApiModelProperty(value = "身份证号")
    private String idNumber;

    @ApiModelProperty(value = "家庭住址")
    private String homeAddress;

    @ApiModelProperty(value = "婚姻状况")
    private Integer maritalStatus;

    @ApiModelProperty(value = "紧急联系人")
    private String emergencyContacts;

    @ApiModelProperty(value = "紧急联系人电话")
    private Long emergencyContactsNumber;

    @ApiModelProperty(value = "备注")
    private String notes;

    @ApiModelProperty(value = "最近登陆时间")
    private LocalDateTime lastLoginTime;

    @ApiModelProperty(value = "md5加密使用")
    private String salt;

    @ApiModelProperty(value = "令牌")
    private String token;

    @ApiModelProperty(value = "头像")
    private String photo;

    @ApiModelProperty(value = "绑定手机设备")
    private String bindingMobileDevices;

    @ApiModelProperty(value = "创建人")
    private Long creator;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改人")
    private Long updator;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "毕业日期")
    private LocalDate graduationDate;

    @ApiModelProperty(value = "省级ID")
    private Integer provinceId;

    @ApiModelProperty(value = "市级ID")
    private Integer cityId;

    @ApiModelProperty(value = "县级ID")
    private Integer countyId;

    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    @ApiModelProperty(value = "最近使用时间")
    private LocalDateTime lastUseTime;

    @ApiModelProperty(value = "账户状态  0：禁用  1：启用")
    private Integer accountStatus;

    @ApiModelProperty(value = "显示顺序从1开始，数值越小，排列越靠前")
    private Integer showOrder;

    @ApiModelProperty(value = "第一次登录时间")
    private LocalDateTime firstLoginTime;

    @ApiModelProperty(value = "最后修改密码日期")
    private LocalDate lastUpdatePassword;

    @ApiModelProperty(value = "是否认证   0：未认证  1：已认证")
    private Integer authenticate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
