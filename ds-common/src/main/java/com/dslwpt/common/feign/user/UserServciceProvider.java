package com.dslwpt.common.feign.user;

import com.dslwpt.common.domain.RemoteCallEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Date 2021/3/18 16:43
 * @Created by xiezz
 */
@FeignClient(value = "ds-user")
public interface UserServciceProvider {


    @GetMapping("/user/sayName")
    String remoteCall(RemoteCallEntity entity);


}
