package com.nacos.microservice.controller;

import com.nacos.microservice.service.MessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {

    @Resource
    private MessageProvider messageProvider;

    @GetMapping("/sendMsg")
    public String send() {
        return messageProvider.send();
    }
}
