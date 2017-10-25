package com.quincy.cloud.controller;

import com.quincy.cloud.client.UserServiceClient;
import com.quincy.cloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PretrialController {

    @Autowired
    UserServiceClient userServiceClient;

    @GetMapping("/getUserInfo/{id}")
    public User getUserInfo(@PathVariable Integer id) {
        return userServiceClient.getUserInfo(id);
    }
}
