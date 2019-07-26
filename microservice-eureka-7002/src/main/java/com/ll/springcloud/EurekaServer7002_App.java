package com.ll.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @package com.ll.com.ll.springcloud
 * @Author LL
 * @ClassName EurekaServer7001_App
 * @Date 2019/7/23  11:16
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class,args);
    }

}
