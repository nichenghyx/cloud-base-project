package com.heyx.springcloud.route;

import com.heyx.springcloud.common.ResponseUtils;
import com.heyx.springcloud.constant.ApiConst;
import com.heyx.springcloud.entity.payment.Serial;
import com.heyx.springcloud.service.payment.SerialService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(ApiConst.PC  + "/document/file")
@Api(tags = ApiConst.PC + "付款编号管理")
public class PaymentCtr {
    @Resource
    private SerialService service;

    @PostMapping("/create")
    public ResponseUtils create(String num){
        int result = service.create(num);
        if (result > 0){
            return ResponseUtils.getSuccessResponseJoData(num);
        }else {
            return ResponseUtils.getBadRequestJoMsg("插入失败~");
        }
    }

    @GetMapping("/get/{id}")
    public ResponseUtils selectById(@PathVariable("id") String id){
        Serial serial = service.selectById(id);
        if (null != serial){
            return ResponseUtils.getSuccessResponseJoData(serial);
        }else {
            return ResponseUtils.getBadRequestJoMsg("插入失败~");
        }
    }



}
