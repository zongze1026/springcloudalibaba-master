package com.dslwpt.user.service.impl;

import com.dslwpt.common.domain.RemoteCallEntity;
import com.dslwpt.user.mapper.UserMapper;
import com.dslwpt.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Date 2021/3/18 16:41
 * @Created by xiezz
 */
@Service
public class RemoteCallServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String sayName(RemoteCallEntity remoteCallEntity) {
        userMapper.save(remoteCallEntity);
        return String.format("my name is %s,age %s",remoteCallEntity.getName(),remoteCallEntity.getAge());
    }
}
