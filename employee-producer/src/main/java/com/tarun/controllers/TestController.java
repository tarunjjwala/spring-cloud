package com.tarun.controllers;

import com.tarun.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee firstPage() {

        System.out.println("Inside firstPage");

        Employee emp = new Employee();
        emp.setName("Tarun Jhunjhunwala");
        emp.setDesignation("manager TaRUN");
        emp.setEmpId("1");
        emp.setSalary(30000);

        return emp;
    }

    public Employee getDataFallBack() {

        System.out.println("Inside fallBack");

        Employee emp = new Employee();
        emp.setName("fallback-emp1");
        emp.setDesignation("fallback-manager");
        emp.setEmpId("fallback-1");
        emp.setSalary(2000);

        return emp;

    }

}