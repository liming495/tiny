package com.guppy.b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ServiceBController {
    @Autowired
    EurekaDiscoveryClient discoveryClient;

    @Value(value = "${msg:unknown}")
    private String msg;

    public String printServiceB(){
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        return serviceInstance.getServiceId()
                + " ("
                + serviceInstance.getHost()
                + ":"
                + serviceInstance.getPort()
                + ")"
                + "===>Say "
                + msg;
    }
}