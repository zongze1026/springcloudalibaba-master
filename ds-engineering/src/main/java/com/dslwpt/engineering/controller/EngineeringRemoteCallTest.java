package com.dslwpt.engineering.controller;

import com.dslwpt.common.domain.Order;
import com.dslwpt.engineering.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2021/3/18 16:38
 * @Created by xiezz
 */
@RestController
@RequestMapping("engineering")
public class EngineeringRemoteCallTest {


    @Autowired
    private OrderService orderService;


    @GetMapping("/call/userService")
    public String remoteCall(){
        Order order = new Order();
        order.setProductName("电视机");
        order.setPrice(1000);
        return orderService.addOrder(order);
    }






}
