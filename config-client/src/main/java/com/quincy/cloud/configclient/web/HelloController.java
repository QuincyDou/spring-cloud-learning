package com.quincy.cloud.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${foo}")
    String foo;

    @GetMapping("/hello")
    public String hello() {
        return foo;
    }
}
