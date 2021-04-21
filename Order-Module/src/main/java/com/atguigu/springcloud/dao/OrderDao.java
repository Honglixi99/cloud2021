package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Honglixi
 * @create 2021-04-20-21:49
 */
@Mapper
public interface OrderDao {
    /**
     * 新建订单
     * @param order
     * @return
     */
    int create(Order order);

    /**
     * 修改订单状态，从0改为1
     * @param userId
     * @param status
     * @return
     */
    int update(@Param("userid") Long userId,@Param("status") Integer status);
}
