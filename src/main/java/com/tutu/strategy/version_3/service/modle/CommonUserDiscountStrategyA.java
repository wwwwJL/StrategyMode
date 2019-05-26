package com.tutu.strategy.version_3.service.modle;

import org.springframework.stereotype.Component;

@Component
public class CommonUserDiscountStrategyA extends DiscountStrategy {
    @Override
    public Integer code() {
        return StrategyConsts.commonUserDiscountStrategyA;
    }

    @Override
    public Double getDiscountAmount(Integer originalPrice) {
        System.out.println("该用户不享受优惠！");
        return originalPrice.doubleValue();
    }
}
