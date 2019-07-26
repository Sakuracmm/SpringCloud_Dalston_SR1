package com.ll.springcloud.service;

import com.ll.springcloud.entities.Dept;

import java.util.List;

/**
 * @package com.ll.com.ll.springcloud.service
 * @Author LL
 * @ClassName IDeptService
 * @Date 2019/7/23  9:16
 */
public interface IDeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}
