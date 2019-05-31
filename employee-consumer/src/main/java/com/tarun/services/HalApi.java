package com.tarun.services;


import com.tarun.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="hal-api")
public interface HalApi {
    @RequestMapping(method= RequestMethod.GET, value="/employee")
    Employee getData();

}