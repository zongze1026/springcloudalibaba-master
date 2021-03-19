package com.dslwpt.user.service.impl;

import com.dslwpt.common.domain.RemoteCallEntity;
import com.dslwpt.common.dubbo.UserService;
import com.dslwpt.user.mapper.UserMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Date 2021/3/19 16:02
 * @Created by xiezz
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public String sayName(RemoteCallEntity remoteCallEntity) {
        userMapper.save(remoteCallEntity);
        return String.format("my name is %s,age %s",remoteCallEntity.getName(),remoteCallEntity.getAge());
    }
}
