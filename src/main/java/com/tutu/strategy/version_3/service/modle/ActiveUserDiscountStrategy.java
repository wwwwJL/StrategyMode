package com.tutu.strategy.version_3.service.modle;

import org.springframework.stereotype.Component;

@Component
public class ActiveUserDiscountStrategy extends DiscountStrategy {
    @Override
    public Integer code() {
        return StrategyConsts.activeUserDiscountStrategy;
    }

    @Override
    public Double getDiscountAmount(Integer originalPrice) {
        System.out.println("该用户享受8折优惠！");
        return originalPrice * 0.8;
    }
}
