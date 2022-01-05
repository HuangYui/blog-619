package com.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bolg.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : HY
* @version : V1.0
* @ClassName : UserMapper
* @Description:
* @date : 2022-1-5 11:19:21
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
