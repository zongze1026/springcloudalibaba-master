package com.dslwpt.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Date 2021/3/18 16:08
 * @Created by xiezz
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.dslwpt.common.feign")
@MapperScan(basePackages = {"com.dslwpt.user.mapper"})
public class DsUserApp {

    public static void main(String[] args) {
        SpringApplication.run(DsUserApp.class, args);
    }


}
