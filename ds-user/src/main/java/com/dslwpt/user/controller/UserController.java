package com.dslwpt.user.controller;

import com.dslwpt.common.domain.RemoteCallEntity;
import com.dslwpt.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Date 2021/3/18 16:50
 * @Created by xiezz
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("sayName")
    public String sayName(@RequestBody RemoteCallEntity remoteCallEntity){
        return userService.sayName(remoteCallEntity);
    }







}
