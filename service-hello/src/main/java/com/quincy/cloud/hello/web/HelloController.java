package com.quincy.cloud.hello.web;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    private static final Logger LOG = Logger.getLogger(HelloController.class.getName());

    @Value("${server.port}")
    String port;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        return "Hello SpringCloud " + port;
    }

    @GetMapping("/hi")
    public String callHi(){
        LOG.log(Level.INFO, "calling trace service-hello  ");
        return restTemplate.getForObject("http://localhost:10803/info", String.class);
    }
    @GetMapping("/info")
    public String info(){
        LOG.log(Level.INFO, "calling trace service-hello ");
        return "I'm service-hello";
    }
}
