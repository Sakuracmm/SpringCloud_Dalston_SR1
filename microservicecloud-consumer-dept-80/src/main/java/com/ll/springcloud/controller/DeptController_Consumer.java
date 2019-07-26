package com.ll.springcloud.controller;

import com.ll.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @package com.ll.com.ll.springcloud.controller
 * @Author LL
 * @ClassName DeptController_Consumer
 * @Date 2019/7/23  9:59
 */
@RestController
public class DeptController_Consumer {

//    private static final String REST_URL_PREFIX = "http://localhost:8001";        并不规范，因为这段代码并没有从Eureka注册中心去寻找微服务
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT/";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * (url,requestMap,ResponseBean.class)这三个参数分别代表
     * REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX + "dept/add",dept,Boolean.class);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/get/"+id,Dept.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/list",List.class);
    }

    //测试@EnableDiscoveryClient，消费端可以调用服务发现
    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/discovery", Object.class);
    }



}
