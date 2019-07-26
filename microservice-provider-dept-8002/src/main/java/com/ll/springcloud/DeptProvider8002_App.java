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
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class,args);
    }
}

