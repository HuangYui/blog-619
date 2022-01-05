package com.blog.sso.service;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : LoginService
 * @Description:
 * @date : 2022/1/5 16:50
 */
public interface LoginService {

    /**
     * 登录
     *
     * @param account account
     * @param password password
     * @return 结果
     */
    public String login(String account,String password);
}
