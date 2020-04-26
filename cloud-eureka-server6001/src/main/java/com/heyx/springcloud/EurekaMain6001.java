package com.heyx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain6001.class, args);
    }
}
