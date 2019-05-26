package com.tutu.strategy.version_3.service.modle;

import org.springframework.stereotype.Component;

@Component
public class NewUserDiscountStrategy extends DiscountStrategy {
    @Override
    public Integer code() {
        return StrategyConsts.newUserDiscountStrategy;
    }

    @Override
    public Double getDiscountAmount(Integer originalPrice) {
        System.out.println("该用户享受5折优惠！");
        return originalPrice * 0.5;
    }
}
