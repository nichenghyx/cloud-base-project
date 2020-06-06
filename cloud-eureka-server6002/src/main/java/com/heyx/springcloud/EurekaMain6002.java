package com.heyx.springcloud;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaMain6002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain6002.class, args);
    }
}
