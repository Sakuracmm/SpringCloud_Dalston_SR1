package com.ll.springcloud;

import com.ll.myruler.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @package com.ll.com.ll.springcloud
 * @Author LL
 * @ClassName DeptComsumer80_App
 * @Date 2019/7/23  10:15
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptComsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptComsumer80_App.class,args);
    }
}
