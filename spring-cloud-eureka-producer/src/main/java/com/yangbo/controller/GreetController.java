package com.yangbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangbo
 * @Description:
 * @Date: Create in 2020/7/12 14:46
 */
@RestController
public class GreetController {

    @RequestMapping("/greet")
    public String greet(){
        return "producer1 say hello";
    }
}
