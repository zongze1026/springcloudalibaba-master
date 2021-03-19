package com.dslwpt.engineering;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Date 2021/3/18 16:08
 * @Created by xiezz
 */
@MapperScan(basePackages = {"com.dslwpt.engineering.mapper"})
@EnableFeignClients(basePackages = "com.dslwpt.common.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class DsEngineeringApp {


    public static void main(String[] args) {
        SpringApplication.run(DsEngineeringApp.class, args);
    }


}
