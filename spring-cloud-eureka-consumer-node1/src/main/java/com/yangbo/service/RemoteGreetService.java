package com.yangbo.service;

import com.yangbo.hystrixfallback.RemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: yangbo
 * @Description:
 * @Date: Create in 2020/7/12 13:35
 */
@FeignClient(name = "spring-cloud-eureka-producer",fallback = RemoteHystrix.class)
public interface RemoteGreetService {
    @RequestMapping(value = "/greet",method = RequestMethod.GET)
    String greet();
}
