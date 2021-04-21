package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Honglixi
 * @create 2021-04-20-22:09
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    /**
     * 减库存
     * @param producrId
     * @param count
     * @return
     */
    @PostMapping(value = "storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long producrId,@RequestParam("count") Integer count);
}
