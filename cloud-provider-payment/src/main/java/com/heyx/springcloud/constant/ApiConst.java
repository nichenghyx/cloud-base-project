package com.heyx.springcloud.constant;

public interface ApiConst {

    String VERSION = "/v1";

    String PREFIX =  "/api";
    String PROJECT ="/payment";
    String PC_MODE ="/pc";
    String WX_MODE ="/wx";

    String PC = PREFIX + PROJECT + VERSION + PC_MODE;
    String WX = PREFIX + PROJECT + VERSION + WX_MODE;

    String PC_TAG = "PC-";
    String WX_TAG = "WX-";

}
