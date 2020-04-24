package com.heyx.springcloud.service.payment;

import com.heyx.springcloud.dao.payment.SerialDao;
import com.heyx.springcloud.entity.payment.Serial;
import com.heyx.springcloud.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SerialService extends BaseService<SerialDao, Serial> {
    @Resource
    private SerialDao serialDao;

    public int create(Serial serial){
        return serialDao.create(serial);
    }

    public Serial selectById(String id){
        return serialDao.selectById(id);
    }
}
