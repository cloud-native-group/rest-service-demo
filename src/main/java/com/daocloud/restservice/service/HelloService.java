package com.daocloud.restservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HelloService {

    @Value("${server.port}")
    private String port;

    public Map<String,String> sayHello(){
        Map<String, String> map = new HashMap<>();
        map.put("message","hello");
        map.put("port",port);
        return map;
    }
}
