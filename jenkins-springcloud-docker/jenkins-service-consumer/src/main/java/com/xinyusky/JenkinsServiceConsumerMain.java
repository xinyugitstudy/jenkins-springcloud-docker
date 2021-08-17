package com.xinyusky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @description
 * @date 2021/8/17 16:30
 * @change 2021/8/17 16:30 by 邮箱 for init
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class JenkinsServiceConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(JenkinsServiceConsumerMain.class, args);
    }
}
