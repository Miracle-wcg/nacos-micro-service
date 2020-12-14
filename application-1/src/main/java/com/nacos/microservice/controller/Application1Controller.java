package com.nacos.microservice.controller;

import com.nacos.microservice.api.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application1Controller {

    @org.apache.dubbo.config.annotation.Reference
    ConsumerService consumerService;

    @GetMapping("service")
    public String service() {
        String service = consumerService.service();
        return "Hello Nacos | " + service;
    }
}
