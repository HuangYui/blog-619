package com.blog.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 声明需要调用的微服务名称
 *  @FeignClient
 *      * name : 服务提供者的名称
 */
@FeignClient(name="gzlover-web-server")
public interface TestFeignClient {

    /**
     * 配置需要调用的微服务接口
     */
    @RequestMapping(value="/echo/{str}",method = RequestMethod.GET)
    public String findById(@PathVariable("str") String str);
}