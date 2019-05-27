package com.guppy.d.controller;

import com.guppy.d.client.ServiceBClient;
import com.guppy.d.client.ServiceD1Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ServiceD3Controller {
    @Value(value = "${name:unknown}")
    private String name;
    @Autowired
    EurekaDiscoveryClient discoveryClient;
    @Autowired
    private ServiceD1Client serviceD1Client;
    @Autowired
    private ServiceBClient serviceBClient;


    @GetMapping(value = "/")
    public String printServiceA(){
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        return serviceInstance.getServiceId()
                + " (" + serviceInstance.getHost()
                + ":"
                + serviceInstance.getPort()
                + ") ===>name:"
                + name
                + "<br/>"
                + serviceD1Client.printServiceD1()
                + "<br/>"
                + serviceBClient.printServiceB();
    }
}
