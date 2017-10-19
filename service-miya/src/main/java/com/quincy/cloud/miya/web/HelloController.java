package com.quincy.cloud.miya.web;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    private static final Logger LOG = Logger.getLogger(HelloController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hi")
    public String hi() {
        LOG.log(Level.INFO, "hi is being called");
        return "Hi, I'm miya!";
    }

    @GetMapping("/info")
    public String info() {
        LOG.log(Level.INFO, "info is being called");
        return restTemplate.getForObject("http://localhost:10802/info", String.class);
    }
}
