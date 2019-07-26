package com.ll.springcloud.mapper;

import com.ll.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @package com.ll.com.ll.springcloud.dao
 * @Author LL
 * @ClassName DeptDao
 * @Date 2019/7/23  9:06
 */
@Mapper
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
