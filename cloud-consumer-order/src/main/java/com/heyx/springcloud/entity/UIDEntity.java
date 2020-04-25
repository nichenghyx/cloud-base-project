package com.heyx.springcloud.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


@Data
public class UIDEntity implements Serializable {

    private static final long serialVersionUID = -4001250154530057343L;

    @ApiModelProperty("主键Id")
    private String id;
}
