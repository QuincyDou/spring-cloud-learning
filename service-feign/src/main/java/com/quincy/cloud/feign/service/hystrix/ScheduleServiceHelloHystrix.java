package com.quincy.cloud.feign.service.hystrix;

import com.quincy.cloud.feign.service.ScheduleServiceHello;
import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceHelloHystrix implements ScheduleServiceHello {

    @Override
    public String sayHello() {
        return "Sorry, Error Error Error";
    }
}
