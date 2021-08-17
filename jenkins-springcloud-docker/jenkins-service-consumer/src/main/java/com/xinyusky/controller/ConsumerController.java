package com.xinyusky.controller;

import com.xinyusky.common.AppReply;
import com.xinyusky.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description
 * @date 2021/8/17 16:37
 * @change 2021/8/17 16:37 by 邮箱 for init
 */
@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @PostMapping("test")
    public AppReply<String> test(){
        return  consumerService.test();
    }

}
