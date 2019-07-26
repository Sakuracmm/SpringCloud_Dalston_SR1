package com.ll.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @package com.ll.com.ll.springcloud
 * @Author LL
 * @ClassName Config_3344_StartSpringCloudApp
 * @Date 2019/7/26  9:58
 */

@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
    }

}
