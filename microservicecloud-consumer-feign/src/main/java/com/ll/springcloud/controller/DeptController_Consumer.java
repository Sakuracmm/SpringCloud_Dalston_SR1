package com.ll.springcloud.controller;

import com.ll.springcloud.entities.Dept;
import com.ll.springcloud.service.DeptClientService;
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

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id){
        return service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept){
        return service.add(dept);
    }




}
