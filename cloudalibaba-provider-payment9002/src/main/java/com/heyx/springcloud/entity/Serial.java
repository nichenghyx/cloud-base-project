package com.heyx.springcloud.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;


@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@AllArgsConstructor
public class Serial extends UIDEntity implements Serializable {

    private static final long serialVersionUID = 4004635697969109670L;

    @ApiModelProperty(value = "编号")
    private String num;
}
