package com.heyx.springcloud.route;


import com.heyx.springcloud.common.ResponseUtils;
import com.heyx.springcloud.model.Serial;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(ApiConst.PC  + "/order")
@Api(tags = ApiConst.PC_TAG + "订单接口")
public class OrderCtr {

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/create")
    public ResponseUtils create(Serial serial){
        return restTemplate.postForObject(serverURL+ ApiConst.PAYMENT_URL + "/payment/create", serial, ResponseUtils.class);
    }

    @GetMapping("/get/{id}")
    public ResponseUtils selectById(@PathVariable("id") String id){
        return restTemplate.getForObject(serverURL+ ApiConst.PAYMENT_URL + "/payment/get/" + id, ResponseUtils.class);
    }
}
