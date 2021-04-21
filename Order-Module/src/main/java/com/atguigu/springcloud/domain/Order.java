package com.atguigu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Honglixi
 * @create 2021-04-20-21:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Long userID;
    private Long productId;
    private Integer count;
    private BigDecimal money;
    //订单状态 0：创建中  1：已完结
    private Integer status;
}
