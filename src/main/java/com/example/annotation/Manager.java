package com.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
//    @Autowired
//    @Qualifier("employee")
//    private Employee employee;

    @Autowired
    @Qualifier("employee1")
    private Employee employee1;

//    @Autowired
//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
//                "employee=" + employee +
                " employee1= "+employee1 +
                '}';
    }
}
