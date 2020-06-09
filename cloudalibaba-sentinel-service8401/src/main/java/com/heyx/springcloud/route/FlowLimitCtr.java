package com.heyx.springcloud.route;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: heyx
 * @create: 2020-06-09 17:03
 * @email; 1064042411@qq.com
 */
@RestController
public class FlowLimitCtr {

    @GetMapping("/testA")
    public String testA(){
        return "---------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "---------testB";
    }

}
