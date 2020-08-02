package com.daocloud.restservice.controller;


import com.daocloud.restservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private HelloService service;

    @GetMapping("/")
    public Map<String, String> sayHello(){
        return service.sayHello();
    }

}
