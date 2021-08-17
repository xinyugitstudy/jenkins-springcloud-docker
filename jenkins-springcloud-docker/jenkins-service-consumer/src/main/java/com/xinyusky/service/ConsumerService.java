package com.xinyusky.service;

import com.xinyusky.common.AppReply;
import com.xinyusky.feign.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @description
 * @date 2021/8/17 16:35
 * @change 2021/8/17 16:35 by 邮箱 for init
 */

@Service
public class ConsumerService {
    @Autowired
    private ProductClient productClient;

    public AppReply<String> test(){
        return productClient.test();
    }
}
