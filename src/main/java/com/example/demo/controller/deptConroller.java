package com.example.demo.controller;

import com.example.demo.entity.Person;

import java.util.List;
import java.util.Map;

/**
 * @description: deptConroller
 * @author: ${༺评༒生༻}
 * @date: 2019-07-25 15:21
 * @Version 1.0
 */
public class deptConroller {

    private  String name;
    /*@Value ("${person.age}")*/
    private  Integer age;
    /* @Value ("${person.sex}")*/
    private  String sex;

    private  Integer[] nums;
    private List<String> list1;

    private Map<String,String> map;
    private  List<Person> phones;

    public static void main(String[] args) {
        System.out.println ("66666");
        System.out.println ("77777" );
        System.out.println ("654215");
        System.out.println ("7878" );
    }

}
