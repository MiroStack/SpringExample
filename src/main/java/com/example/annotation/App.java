package com.example.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("componentScanDemo.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

                Employee employee =(Employee) context.getBean("employee1");
        System.out.println(employee.toString());
        Manager manager = context.getBean("manager", Manager.class);
        System.out.println(manager.toString());
    }
}
