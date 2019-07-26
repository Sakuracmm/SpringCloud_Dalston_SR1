package com.ll.springcloud.service.impl;

import com.ll.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ll.springcloud.mapper.DeptMapper;
import com.ll.springcloud.service.IDeptService;

import java.util.List;

/**
 * @package com.ll.com.ll.springcloud.service.impl
 * @Author LL
 * @ClassName DeptServiceImpl
 * @Date 2019/7/23  9:18
 */
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        List<Dept> list = deptMapper.findAll();
        return list;
    }
}
