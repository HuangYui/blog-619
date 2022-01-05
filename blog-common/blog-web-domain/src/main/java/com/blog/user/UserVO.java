package com.blog.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @description 用户表
 * @author HY
 * @date 2022-01-05
 */
@Data
@ApiModel("用户表VO")
@Builder
public class UserVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty("id")
    private Long id;

    /**
     * 账号
     */
    @ApiModelProperty("账号")
    private Long account;

    /**
     * 姓名
     */
    @ApiModelProperty("姓名")
    private String userName;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     * 手机号
     */
    @ApiModelProperty("手机号")
    private Long phoneNumber;

    /**
     * 性别 0:男 1：女
     */
    @ApiModelProperty("性别 0:男 1：女")
    private Integer gender;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    private String mailbox;

    /**
     * 微信号
     */
    @ApiModelProperty("微信号")
    private String wechatNumber;

    /**
     * 生日
     */
    @ApiModelProperty("生日")
    private Date birthday;

    /**
     * 籍贯
     */
    @ApiModelProperty("籍贯")
    private String origin;

    /**
     * 民族表的id，默认为汉族
     */
    @ApiModelProperty("民族表的id，默认为汉族")
    private Integer nationalId;

    /**
     * 身份证号
     */
    @ApiModelProperty("身份证号")
    private String idNumber;

    /**
     * 家庭住址
     */
    @ApiModelProperty("家庭住址")
    private String homeAddress;

    /**
     * 婚姻状况
     */
    @ApiModelProperty("婚姻状况")
    private Integer maritalStatus;

    /**
     * 紧急联系人
     */
    @ApiModelProperty("紧急联系人")
    private String emergencyContacts;

    /**
     * 紧急联系人电话
     */
    @ApiModelProperty("紧急联系人电话")
    private Long emergencyContactsNumber;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String notes;

    /**
     * 最近登陆时间
     */
    @ApiModelProperty("最近登陆时间")
    private Date lastLoginTime;

    /**
     * md5加密使用
     */
    @ApiModelProperty("md5加密使用")
    private String salt;

    /**
     * 令牌
     */
    @ApiModelProperty("令牌")
    private String token;

    /**
     * 头像
     */
    @ApiModelProperty("头像")
    private String photo;

    /**
     * 绑定手机设备
     */
    @ApiModelProperty("绑定手机设备")
    private String bindingMobileDevices;

    /**
     * 创建人
     */
    @ApiModelProperty("创建人")
    private Long creator;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 修改人
     */
    @ApiModelProperty("修改人")
    private Long updator;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date updateTime;

    /**
     * 毕业日期
     */
    @ApiModelProperty("毕业日期")
    private Date graduationDate;

    /**
     * 省级id
     */
    @ApiModelProperty("省级id")
    private String provinceId;

    /**
     * 市级id
     */
    @ApiModelProperty("市级id")
    private String cityId;

    /**
     * 县级id
     */
    @ApiModelProperty("县级id")
    private String countyId;

    /**
     * 角色id
     */
    @ApiModelProperty("角色id")
    private Long roleId;

    /**
     * 最近使用时间
     */
    @ApiModelProperty("最近使用时间")
    private Date lastUseTime;

    /**
     * 账户状态 0：禁用 1：启用
     */
    @ApiModelProperty("账户状态 0：禁用 1：启用")
    private Integer accountStatus;

    /**
     * 显示顺序从1开始，数值越小，排列越靠前
     */
    @ApiModelProperty("显示顺序从1开始，数值越小，排列越靠前")
    private String showOrder;

    /**
     * 第一次登录时间
     */
    @ApiModelProperty("第一次登录时间")
    private Date firstLoginTime;

    /**
     * 最后修改密码日期
     */
    @ApiModelProperty("最后修改密码日期")
    private Date lastUpdatePassword;

    /**
     * 是否认证  0：未认证 1：已认证
     */
    @ApiModelProperty("是否认证  0：未认证 1：已认证")
    private Integer authenticate;

}