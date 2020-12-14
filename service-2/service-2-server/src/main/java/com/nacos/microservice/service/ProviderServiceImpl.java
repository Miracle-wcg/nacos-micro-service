package com.nacos.microservice.service;

import com.nacos.microservice.api.ProviderService;

@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String service() {
        return "Prover invoke";
    }
}
