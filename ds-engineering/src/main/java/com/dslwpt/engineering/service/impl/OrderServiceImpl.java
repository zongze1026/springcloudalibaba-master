package com.dslwpt.engineering.service.impl;

import com.dslwpt.common.domain.Order;
import com.dslwpt.common.domain.RemoteCallEntity;
import com.dslwpt.common.dubbo.UserService;
import com.dslwpt.common.feign.user.UserServciceProvider;
import com.dslwpt.engineering.mapper.OrderMapper;
import com.dslwpt.engineering.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Date 2021/3/19 11:08
 * @Created by xiezz
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private UserServciceProvider userServciceProvider;
    @Reference
    private UserService userService;

    @GlobalTransactional(rollbackFor = Exception.class)
    @Override
    public String addOrder(Order order) {
        orderMapper.addOrder(order);
        RemoteCallEntity entity = new RemoteCallEntity();
        entity.setName("李四");
        entity.setAge(50);
        return userService.sayName(entity);
    }
}
