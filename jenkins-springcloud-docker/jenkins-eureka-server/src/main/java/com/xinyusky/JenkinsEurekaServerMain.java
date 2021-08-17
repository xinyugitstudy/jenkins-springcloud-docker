package com.xinyusky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 * @description
 * @date 2021/8/17 15:45
 * @change 2021/8/17 15:45 by 邮箱 for init
 */

@SpringBootApplication
@EnableEurekaServer
public class JenkinsEurekaServerMain {
    public static void main(String[] args) {
        SpringApplication.run(JenkinsEurekaServerMain.class, args);
    }
}
