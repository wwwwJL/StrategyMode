package com.tutu.strategy.version_3.service.modle;

import org.springframework.beans.factory.InitializingBean;

import java.util.concurrent.ConcurrentHashMap;

public abstract class DiscountStrategy implements InitializingBean{

    /**
     * 注册表，内部存放着DiscountStrategy所有的策略bean
     */
    public static ConcurrentHashMap<Integer, DiscountStrategy> map = new ConcurrentHashMap<>(10);

    @Override
    public void afterPropertiesSet() throws Exception {
        //当DiscountStrategy注入到spring容器中后，同时也注册至次map中
        map.put(code(),this);
    }

    public abstract Integer code();
    /**
     * 获取用户对应折扣价
     */
    public abstract Double getDiscountAmount(Integer originalPrice);
}
