package com.nacos.microservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//远程调用服务若配置context-path, 须手动设置path
@FeignClient(name = "nacos-provider", path = "/nacos-provider", fallback = RemoteHystrix.class)
public interface RemoteClient {
    @GetMapping("/helloNacos")
    String helloNacos();
}
