package com.quincy.cloud.controller;

import com.quincy.cloud.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getById/{id}")
    public User getById(@PathVariable Integer id) {
        User u = new User();
        u.setId(id);
        u.setName("张三");
        return u;
    }
}
