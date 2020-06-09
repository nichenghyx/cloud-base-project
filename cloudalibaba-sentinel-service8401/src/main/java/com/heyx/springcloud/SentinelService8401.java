package com.heyx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: heyx
 * @create: 2020-06-09 16:18
 * @email; 1064042411@qq.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelService8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelService8401.class, args);
    }
}
