package com.dslwpt.common.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Date 2021/3/18 16:45
 * @Created by xiezz
 */
@Data
public class RemoteCallEntity implements Serializable {

    private String name;
    private Integer age;

}
