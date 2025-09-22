package com.ioc.loose.coupling;

import car.constructor.injection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCCouplingExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");
//        Car car = (Car) context.getBean("myCar");
//        car.displayDetails();
        UserManager userManagerWithMongoDbProvider = (UserManager) context.getBean("userManagerWithMongoDbProvider");
        System.out.println(userManagerWithMongoDbProvider.getUserInfo());
        UserManager userManagerWithUserDbProvider = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userManagerWithUserDbProvider.getUserInfo());
        UserManager userManagerWithWebService = (UserManager) context.getBean("userManagerWithWebService");
        System.out.println(userManagerWithWebService.getUserInfo());
    }
}
