package com.blog.sso.feign;

import com.blog.user.UserDTO;
import com.blog.user.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : UserFeign
 * @Description:
 * @date : 2022/1/5 15:51
 */
@FeignClient(value = "blog-web-server")
public interface UserFeign {

    /**
     * 根据id查询
     *
     * @param id id
     * @return UserVO
     */
    @GetMapping("/user/findById/{id}")
    public UserVO findByUserId(@PathVariable("id") Long id);

    /**
     * 根据userDTO的字段查询
     *
     * @param userDTO userDTO
     * @return UserVO
     */
    @GetMapping("/user/findByUserAccount/{account}")
    public UserVO findByUserAccount(@PathVariable("account") String account);
}
