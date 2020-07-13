package com.yangbo.controller;

import com.yangbo.service.RemoteGreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: yangbo
 * @Description:
 * @Date: Create in 2020/7/12 13:37
 */
@RestController
public class RemoteGreetController {

    @Resource
    private RemoteGreetService remoteGreetService;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return remoteGreetService.greet();
    }
}
