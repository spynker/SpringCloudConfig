package com.yangbo.hystrixfallback;

import com.yangbo.service.RemoteGreetService;
import org.springframework.stereotype.Component;

/**
 * @Author: yangbo
 * @Description:
 * @Date: Create in 2020/7/12 15:09
 */
@Component
public class RemoteHystrix implements RemoteGreetService{
    @Override
    public String greet() {
        return "service is been down";
    }
}
