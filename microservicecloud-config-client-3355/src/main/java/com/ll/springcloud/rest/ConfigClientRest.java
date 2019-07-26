package com.ll.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @package com.ll.com.ll.springcloud
 * @Author LL
 * @ClassName ConfigClientRest
 * @Date 2019/7/26  10:50
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){
        String str = "applicationName: " + applicationName + "\t" + "eurekaServer: " + eurekaServers + "\t" + "port: " + port;
        System.out.println("###########str: " + str);
        return str;
    }

}
