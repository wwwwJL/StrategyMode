package com.tutu.strategy.version_3.service;

import com.tutu.strategy.version_3.service.modle.DiscountStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiscountService {

    public Double getDiscountPriceByUid(Integer uid, Integer originalPrice){
        Integer userCode = getUserTypeByUid(uid);
        return getDiscountStrategy(userCode).getDiscountAmount(originalPrice);
    }

    public DiscountStrategy getDiscountStrategy(Integer userCode){
        DiscountStrategy strategy = DiscountStrategy.map.get(MessageReceiver.currentStrategy.get(userCode));
        if(strategy == null){
            strategy = DiscountStrategy.map.get(MessageReceiver.currentStrategy.get(UserTypeEnum.COMMON.getCode()));
        }
        return strategy;
    }

    public Integer getUserTypeByUid(Integer uid){
        //查询uid对应类型
        return UserTypeEnum.COMMON.getCode();
    }
}
