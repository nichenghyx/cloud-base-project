package com.heyx.springcloud.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.heyx.springcloud.constant.HttpConst;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@Data
@Builder
public class ResponseUtils {

    @ApiModelProperty("状态码")
    private Integer status;
    @ApiModelProperty("数据")
    private Object data;
    @ApiModelProperty("消息提醒")
    private String msg;
    @ApiModelProperty("数量")
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
        }else if(data instanceof Page) {
            return getSuccessResponseJoDataAndTotal(((Page) data).getContent(), ((Page) data).getTotalElements());
        }

        return ResponseUtils.builder()
                .data(data)
                .status(HttpConst.SUCCESS)
                .msg(HttpConst.SUCCESS_MSG)
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
