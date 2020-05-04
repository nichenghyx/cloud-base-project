package com.heyx.springcloud.route;

import com.heyx.springcloud.common.ApiURL;

public interface ApiConst extends ApiURL {
    String VERSION = "/v1";
    String PROJECT ="/consumer";

    String PC = PREFIX + PROJECT + VERSION + PC_MODE;
    String WX = PREFIX + PROJECT + VERSION + WX_MODE;
    String PAYMENT_URL = "http://127.0.0.1:8001/api/provider/v1/pc/";
}
