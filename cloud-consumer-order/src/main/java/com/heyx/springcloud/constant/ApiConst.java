package com.heyx.springcloud.constant;

public interface ApiConst {

    String VERSION = "/v1";

    String PREFIX =  "/api";
    String PROJECT ="/consumer";
    String PC_MODE ="/pc";
    String WX_MODE ="/wx";

    String PC = PREFIX + PROJECT + VERSION + PC_MODE;
    String WX = PREFIX + PROJECT + VERSION + WX_MODE;

    String PC_TAG = "PC-";
    String WX_TAG = "WX-";

     String PAYMENT_URL = "http://127.0.0.1:8001/api/provider/v1/pc";

}
