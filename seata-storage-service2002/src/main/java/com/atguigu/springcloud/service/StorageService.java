package com.atguigu.springcloud.service;

/**
 * @author Honglixi
 * @create 2021-04-21-13:05
 */
public interface StorageService {
    /**
     * 减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId,Integer count);
}
