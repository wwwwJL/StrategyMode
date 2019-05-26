package com.tutu.strategy.version_3.service.modle;

import org.springframework.stereotype.Component;

@Component
public class InsideUserDiscountStrategy extends DiscountStrategy {
    @Override
    public Integer code() {
        return StrategyConsts.insideUserDiscountStrategy;
    }

    @Override
    public Double getDiscountAmount(Integer originalPrice) {
        System.out.println("内部员工享受5折优惠！");
        return originalPrice * 0.5;
    }
}
