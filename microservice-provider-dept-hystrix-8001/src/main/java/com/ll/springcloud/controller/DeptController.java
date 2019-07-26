package com.ll.springcloud.controller;

import com.ll.springcloud.entities.Dept;
import com.ll.springcloud.service.impl.DeptServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @package com.ll.com.ll.springcloud.controller
 * @Author LL
 * @ClassName DeptController
 * @Date 2019/7/23  9:23
 */
@RestController
public class DeptController {

    @Autowired
    private DeptServiceImpl service;

    //添加服务发现接口
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return service.add(dept);
    }

    //一旦调用服务方法失败并抛出异常信息信息后，会自动调用@HystrixCommand标注的方法
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = this.service.get(id);
        if(dept == null){
            throw new RuntimeException("该ID： [" + id + "] 没有对应的数据信息！");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept(id.intValue(),"该ID: [" + id + "] 没有对应的数据信息！ 来自@HystrixCommand" ,"no database includes this message in MySQL!");
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list(){
        return service.list();
    }




    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("*******************" + list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element :srvList){
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t" + element.getUri());
        }
        return this.client;
    }


}
