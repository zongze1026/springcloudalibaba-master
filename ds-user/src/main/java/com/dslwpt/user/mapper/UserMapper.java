package com.dslwpt.user.mapper;

import com.dslwpt.common.domain.RemoteCallEntity;
import org.springframework.stereotype.Repository;

/**
 * @Date 2021/3/18 17:04
 * @Created by xiezz
 */
@Repository
public interface UserMapper {

    void save(RemoteCallEntity remoteCallEntity);


}
