package com.heyx.springcloud.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

public abstract class BaseService<M extends BaseMapper<T>,T> extends ServiceImpl<M, T> implements IService<T> {

}
