package com.heyx.springcloud.service.payment;

import com.heyx.springcloud.mapper.payment.SerialMapper;
import com.heyx.springcloud.model.Serial;
import com.heyx.springcloud.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SerialService extends BaseService<SerialMapper, Serial> {
    @Resource
    private SerialMapper serialMapper;

    public int create(Serial serial){
        return serialMapper.create(serial);
    }

    public Serial selectById(String id){
        return serialMapper.selectById(id);
    }
}
