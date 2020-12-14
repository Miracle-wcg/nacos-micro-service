package com.nacos.microservice.service;

import com.nacos.microservice.api.ConsumerService;
import com.nacos.microservice.api.ProviderService;

@org.apache.dubbo.config.annotation.Service
public class ConsumerServiceImpl implements ConsumerService {
    @org.apache.dubbo.config.annotation.Reference
    ProviderService providerService;
    @Override
    public String service() {
        return "Consumer invoke |" + providerService.service();
    }
}
