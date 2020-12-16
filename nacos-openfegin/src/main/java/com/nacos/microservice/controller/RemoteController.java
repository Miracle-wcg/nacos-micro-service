package com.nacos.microservice.controller;

import com.nacos.microservice.client.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteController {
    @Autowired
    private RemoteClient remoteClient;

    @GetMapping("fegin")
    public String test() {
        return remoteClient.helloNacos();
    }
}
