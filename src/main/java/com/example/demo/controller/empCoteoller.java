package com.example.demo.controller;

import com.example.demo.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @description: empCoteoller
 * @author: ${༺评༒生༻}
 * @date: 2019-07-16 21:17
 * @Version 1.0
 */
@Controller
@RequestMapping("emp")
public class empCoteoller {

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
