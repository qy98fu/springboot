package com.example.demo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description: Dept
 * @author: ${༺评༒生༻}
 * @date: 2019-06-24 20:22
 * @Version 1.0
 */

@Component
@Data
@ConfigurationProperties(prefix = "dept")
public class Dept {
    private  Integer deptno;
    private  String dname;

    public Dept() {
    }

    public Dept(Integer deptno, String dname) {
        this.deptno = deptno;
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                '}';
    }
}
