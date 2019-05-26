package com.tutu.strategy.version_3.service.modle;

import org.springframework.stereotype.Component;

@Component
public class CommonUserDiscountStrategyB extends DiscountStrategy {
    @Override
    public Integer code() {
        return StrategyConsts.commonUserDiscountStrategyB;
    }

    @Override
    public Double getDiscountAmount(Integer originalPrice) {
        System.out.println("该用户享受9折优惠！");
        return originalPrice * 0.9;
    }
}
