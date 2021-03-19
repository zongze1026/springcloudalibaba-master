package com.dslwpt.engineering.service.impl;

import com.dslwpt.common.domain.*;
import com.dslwpt.common.dubbo.OrderService;
import com.dslwpt.engineering.mapper.OrderMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Date 2021/3/19 16:06
 * @Created by xiezz
 */
@Service
public class OrderServiceImpl02 implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void addOrder(Order order) {
        orderMapper.addOrder(order);
    }
}
