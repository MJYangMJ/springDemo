package com.asiainfo.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        String path=System.getProperty("user.dir");
        System.out.println(path);
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(path+"//src//main//resources//ApplicationContextConfiguration.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContextConfiguration.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.getAddress().getCity().toString());
    }

}
