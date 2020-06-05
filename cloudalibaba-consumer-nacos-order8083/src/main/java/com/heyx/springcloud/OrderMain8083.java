package com.heyx.springcloud;


import com.heyx.springcloud.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableSwagger2Doc
@SpringBootApplication
public class OrderMain8083 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain8083.class, args);
    }
}
