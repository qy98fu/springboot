package com.example.demo.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @description: User
 * @author: ${༺评༒生༻}
 * @date: 2019-06-24 10:13
 * @Version 1.0
 */
@Component
@Data
//从配置文件中读取指定前缀的内容，注入到bean中
@ConfigurationProperties(prefix = "person")
@PropertySource ("classpath:person.properties")
public class Person {
    /*@Value ("${person.name}")*/
    private  String name;
    /*@Value ("${person.age}")*/
    private  Integer age;
   /* @Value ("${person.sex}")*/
    private  String sex;

    private  Integer[] nums;
    private List<String> list1;

    private Map<String,String> map;
    private  List<Person> phones;

}
