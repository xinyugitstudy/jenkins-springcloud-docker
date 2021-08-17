package com.xinyusky.controller;

import com.xinyusky.common.AppReply;
import com.xinyusky.common.Constants;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description
 * @date 2021/8/17 16:22
 * @change 2021/8/17 16:22 by 邮箱 for init
 */

@RestController
public class ProducerController {

    @PostMapping("test")
    public AppReply<String> test(){
        AppReply<String> appReply = new AppReply<String>(Constants.APP_CODE_SUCC, "查询成功", "测试返回的数据成功");
        return appReply;
    }
}
