package com.nacos.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("helloNacos")
    public String helloNacos() {
        return "helloNacos";
    }
}
