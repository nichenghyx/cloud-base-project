package com.heyx.springcloud.entity.payment;


import com.baomidou.mybatisplus.annotation.TableName;
import com.heyx.springcloud.entity.UIDEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@TableName("payment_serial")
@Entity
@Table(name = "payment_serial")
@org.hibernate.annotations.Table(appliesTo = "payment_serial", comment = "支付流水号")
@AllArgsConstructor
@NoArgsConstructor
public class Serial extends UIDEntity {

    @ApiModelProperty(value = "编号")
    @Column(columnDefinition = "varchar(200) comment '编号'", nullable = false)
    private String serial;
}
