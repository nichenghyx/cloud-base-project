package com.heyx.springcloud.mapper.payment;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heyx.springcloud.entity.payment.Serial;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SerialMapper extends BaseMapper<Serial> {
    int create(Serial serial);
    Serial selectById(@Param("id") String id);
}
