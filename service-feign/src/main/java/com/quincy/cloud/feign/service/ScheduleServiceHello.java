package com.quincy.cloud.feign.service;

import com.quincy.cloud.feign.service.hystrix.ScheduleServiceHelloHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-hello", fallback = ScheduleServiceHelloHystrix.class)
public interface ScheduleServiceHello {

    @GetMapping("/hello")
    String sayHello();
}
