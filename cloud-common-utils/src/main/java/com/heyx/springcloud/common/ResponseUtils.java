package com.heyx.springcloud.common;

import com.heyx.springcloud.model.IPage;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseUtils {

    private Integer status;
    private Object data;
    private String msg;
    private long total;

    public static ResponseUtils getSuccessResponseJo() {
        return ResponseUtils.builder()
                .status(HttpConst.SUCCESS)
                .msg(HttpConst.SUCCESS_MSG)
                .build();
    }

    public static ResponseUtils getSuccessResponseJoMsg(String msg) {
        return ResponseUtils.builder()
                .msg(msg)
                .status(HttpConst.SUCCESS)
                .build();
    }

    public static ResponseUtils getSuccessResponseJoData(Object data) {
        if (data instanceof IPage){
            return getSuccessResponseJoDataAndTotal(((IPage) data).getRecords(), ((IPage) data).getTotal());
        }
        return ResponseUtils.builder()
                .data(data)
                .status(HttpConst.SUCCESS)
                .msg(HttpConst.SUCCESS_MSG)
                .build();
    }

    public static ResponseUtils getSuccessResponseJoData(String msg,Object data) {
        if (data instanceof IPage){
            return getSuccessResponseJoDataAndTotal(((IPage) data).getRecords(), ((IPage) data).getTotal());
        }
        return ResponseUtils.builder()
                .data(data)
                .status(HttpConst.SUCCESS)
                .msg(msg)
                .build();
    }
    public static ResponseUtils getSuccessResponseJoDataAndTotal(Object data, long total) {
        return ResponseUtils.builder()
                .data(data)
                .total(total)
                .status(HttpConst.SUCCESS)
                .msg(HttpConst.SUCCESS_MSG)
                .build();
    }
    public static ResponseUtils getFailureResponseJoMsg(String msg, Integer status) {
        return ResponseUtils.builder()
                .msg(msg)
                .status(status)
                .build();
    }

    public static ResponseUtils getBadRequestJoMsg(String msg) {
        return ResponseUtils.builder()
                .msg(msg)
                .status(HttpConst.BAD_REQUEST)
                .build();
    }
    public static ResponseUtils getIntervalServerResponseJo() {
        return ResponseUtils.builder()
                .msg(HttpConst.ERROR_500)
                .status(HttpConst.INTERNAL_SERVER_ERROR)
                .build();
    }
    public static ResponseUtils getIntervalServerResponseJoMsg(String msg) {
        return ResponseUtils.builder()
                .msg(msg)
                .status(HttpConst.INTERNAL_SERVER_ERROR)
                .build();
    }
}
