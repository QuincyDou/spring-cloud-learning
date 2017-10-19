package com.quincy.cloud.feign.web;

import com.quincy.cloud.feign.service.ScheduleServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    ScheduleServiceHello scheduleServiceHello;

    @GetMapping("/hello")
    public String hello() {
        return scheduleServiceHello.sayHello();
    }
}
