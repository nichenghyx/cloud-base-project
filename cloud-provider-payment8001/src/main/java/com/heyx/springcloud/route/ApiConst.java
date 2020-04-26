package com.heyx.springcloud.route;

import com.heyx.springcloud.common.ApiURL;

public interface ApiConst extends ApiURL {
    String VERSION = "/v1";
    String PROJECT ="/provider";

    String PC = PREFIX + PROJECT + VERSION + PC_MODE;
    String WX = PREFIX + PROJECT + VERSION + WX_MODE;

}
