package com.ll.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @package com.ll.com.ll.springcloud
 * @Author LL
 * @ClassName Dept
 * @Date 2019/7/22  16:57
 */
//@NoArgsConstructor
@Data
@Accessors
public class Dept implements Serializable { //Entity orm mysql
    private Integer deptno; //主键
    private String dname;   //部门名称
    private String db_source;   //来自哪个数据库，因为微服务可以对应一个数据库，把信息存储到不同的数据库中

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    public Dept(Integer deptno, String dname, String db_source) {
        this.deptno = deptno;
        this.dname = dname;
        this.db_source = db_source;
    }

    public Dept() {
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }
}
