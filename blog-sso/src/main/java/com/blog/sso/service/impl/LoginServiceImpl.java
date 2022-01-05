package com.blog.sso.service.impl;

import cn.hutool.core.codec.Base64;
import cn.hutool.crypto.SecureUtil;
import com.blog.sso.feign.UserFeign;
import com.blog.sso.service.LoginService;
import com.blog.user.UserVO;
import lombok.AllArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : LoginServiceImpl
 * @Description:
 * @date : 2022/1/5 16:50
 */
@Service
@AllArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final UserFeign userFeign;

    /**
     * 登录
     *
     * @param account account
     * @param password password
     * @return 结果
     */
    @Override
    public String login(String account, String password) {
        String accountDecode = Base64.decodeStr(account);
        String passwordDecode = Base64.decodeStr(password);
        UserVO userVO = userFeign.findByUserAccount(accountDecode);
        if (userVO == null) {
            return "账号或密码输入错误,请重新输入";
        }
        String salt = userVO.getSalt();
        String passwordInDB = SecureUtil.md5(passwordDecode + salt);
        if (!passwordInDB.equals(userVO.getPassword())) {
            return "密码错误";
        }
        return "";
    }
}
