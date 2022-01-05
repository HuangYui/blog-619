package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.mapper.UserMapper;
import com.blog.service.UserService;
import com.bolg.entity.User;
import org.springframework.stereotype.Service;

/**
* @author : HY
* @version : V1.0
* @ClassName : UserServiceImpl
* @Description:
* @date : 2022-1-5 11:19:21
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
