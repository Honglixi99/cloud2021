package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.StorageDao;
import com.atguigu.springcloud.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Honglixi
 * @create 2021-04-21-13:07
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;

    /**
     * 减库存
     * @param productId
     * @param count
     */
    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId,count);
    }
}
