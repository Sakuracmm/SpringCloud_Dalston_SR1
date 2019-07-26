package com.ll.springcloud.service;

import com.ll.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @package com.ll.com.ll.springcloud.service
 * @Author LL
 * @ClassName DeptClientServiceFactory
 * @Date 2019/7/25  18:48
 */
//将DeptClientService接口中的每一个方法的熔断机制都统一到这里,就可以和其他子工程下的Controller类实现解耦，但是
//千万不要在这个上面忘记标注@Component注解！！！！
@Component
public class DeptClientServiceFactory implements DeptClientService {
            @Override
            public Dept get(long id) {
                return new Dept((int)id,"该ID: [" + id + "] 没有对应的数据信息！ 来自Hystrix降级服务，此刻服务暂时关闭！" ,"no database includes this message in MySQL!");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
}
