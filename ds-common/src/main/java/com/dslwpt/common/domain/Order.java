package com.dslwpt.common.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Date 2021/3/19 11:05
 * @Created by xiezz
 */
@Data
public class Order implements Serializable {
    private String productName;
    private Integer price;
}
