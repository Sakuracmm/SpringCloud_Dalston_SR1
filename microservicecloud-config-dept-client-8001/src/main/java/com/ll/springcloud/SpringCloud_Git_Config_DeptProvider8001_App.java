package com.ll.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @package com.ll.com.ll.springcloud
 * @Author LL
 * @ClassName DeptProvider8001_App
 * @Date 2019/7/23  9:29
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class SpringCloud_Git_Config_DeptProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloud_Git_Config_DeptProvider8001_App.class,args);
    }
}

