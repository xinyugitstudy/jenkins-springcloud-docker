package com.xinyusky.feign.client;

import com.xinyusky.common.AppReply;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Administrator
 * @description
 * @date 2021/8/17 16:33
 * @change 2021/8/17 16:33 by 邮箱 for init
 */

@FeignClient(name = "jenkins-service-producer" )
@Component
public interface ProductClient {

    @PostMapping("test")
    public AppReply<String> test();
}
