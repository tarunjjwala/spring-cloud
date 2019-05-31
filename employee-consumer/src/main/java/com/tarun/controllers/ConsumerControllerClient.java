package com.tarun.controllers;

import com.tarun.model.Employee;
import com.tarun.services.HalApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ConsumerControllerClient {

    @Autowired
    private HalApi halApi;


    @GetMapping(value = "/data")
    public Employee getData(){
        return halApi.getData();
    }
}
