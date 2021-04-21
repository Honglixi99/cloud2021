package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/** 减库存
 * @author Honglixi
 * @create 2021-04-21-12:54
 */
@Mapper
public interface StorageDao {
    /**
     * 减库存
     * @param productId
     * @param count
     * @return
     */
    int decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
