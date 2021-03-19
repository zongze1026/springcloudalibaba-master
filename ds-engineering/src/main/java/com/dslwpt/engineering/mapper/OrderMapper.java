package com.dslwpt.engineering.mapper;

import com.dslwpt.common.domain.Order;
import org.springframework.stereotype.Repository;

/**
 * @Date 2021/3/18 17:04
 * @Created by xiezz
 */
@Repository
public interface OrderMapper {

    void addOrder(Order order);


}
