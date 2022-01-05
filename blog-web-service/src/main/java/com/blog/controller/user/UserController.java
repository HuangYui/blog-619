package com.blog.controller.user;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.blog.service.UserService;
import com.blog.user.UserDTO;
import com.blog.user.UserVO;
import com.bolg.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : UserController
 * @Description:
 * @date : 2022/1/5 15:57
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/findById/{id}")
    public UserVO findByUserId(@PathVariable("id") Long id) {
        User user = userService.getById(id);
        return UserVO.builder()
                .userName(user.getUserName())
                .account(user.getAccount())
                .password(user.getPassword())
                .salt(user.getSalt()).build();
    }

    /**
     * 根据userDTO的字段查询
     *
     * @param account account
     * @return UserVO
     */
    @GetMapping("/findByUserAccount/{account}")
    public UserVO findByUserAccount(@PathVariable("account") String account) {
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.eq(User::getAccount,account);
        User user = userService.getOne(userLambdaQueryWrapper);
        return UserVO.builder()
                .userName(user.getUserName())
                .account(user.getAccount())
                .password(user.getPassword())
                .salt(user.getSalt()).build();
    }

}
