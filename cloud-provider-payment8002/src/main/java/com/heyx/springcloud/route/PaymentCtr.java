package com.heyx.springcloud.route;

import com.heyx.springcloud.common.ResponseUtils;
import com.heyx.springcloud.model.Serial;
import com.heyx.springcloud.service.payment.SerialService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(ApiConst.PC  + "/payment")
@Api(tags = ApiConst.PC_TAG + "付款编号管理")
public class PaymentCtr {
    @Resource
    private SerialService service;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public ResponseUtils create(@RequestBody Serial serial){
        int result = service.create(serial);
        if (result > 0){
            return ResponseUtils.getSuccessResponseJoData("插入成功，端口为：" + serverPort,serial);
        }else {
            return ResponseUtils.getBadRequestJoMsg("插入失败~");
        }
    }

    @GetMapping("/get/{id}")
    public ResponseUtils selectById(@PathVariable("id") String id){
        Serial serial = service.selectById(id);
        if (null != serial){
            return ResponseUtils.getSuccessResponseJoData("查询成功，端口为：" + serverPort,serial);
        }else {
            return ResponseUtils.getBadRequestJoMsg("查询失败~");
        }
    }



}
