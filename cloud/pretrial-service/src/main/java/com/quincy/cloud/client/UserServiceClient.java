package com.quincy.cloud.client;

import com.quincy.cloud.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
public interface UserServiceClient {

    @GetMapping("/getById/{id}")
    User getUserInfo(@PathVariable("id") Integer id);
}
