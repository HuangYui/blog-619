package com.blog.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SaSsoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaSsoServerApplication.class, args);
        System.out.println("\n------ Sa-Token-SSO 认证中心启动成功");
    }
}