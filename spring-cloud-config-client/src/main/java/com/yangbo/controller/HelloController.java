package com.yangbo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangbo
 * @Description:
 * @Date: Create in 2020/7/12 18:06
 */
@RestController
@RefreshScope
class HelloController {
    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
