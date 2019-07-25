package com.example.demo;

import com.example.demo.entity.Dept;
import com.example.demo.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    ApplicationContext context;

    @Test
    public void contextLoads() {
        Person person=context.getBean (Person.class);
        /*System.out.println (person);*/
        System.out.println (person.getName ());
       /* System.out.println (person.getNums ()[1]);
        System.out.println (person.getList1 ());
        System.out.println (person.getMap ());
        System.out.println (person.getPhones ());*/
    }

    @Test
    public  void c(){
        Dept dept =context.getBean (Dept.class);
        System.out.println (dept+"欧尼酱");
    }
}
