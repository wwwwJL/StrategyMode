package com.tutu.strategy.version_2;

//import com.tutu.strategy.version_2.modle.DiscountStrategy;
//import com.tutu.strategy.version_2.modle.DiscountStrategyEnum;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DiscountService {
//
//    /**
//     * 获取用户对应sku的折扣价
//     */
//    public Double getDiscountPriceByUid(Integer uid, Integer originalPrice){
//        Integer userCode = getCodeByUid(uid);
//        DiscountStrategy strategy =
//                SpringUtils.getBean(DiscountStrategyEnum.typeMap.get(userCode), DiscountStrategy.class);
//        return strategy.getDiscountAmount(originalPrice);
//    }
//
//    /**
//     * 获取用户对应的身份值
//     */
//    public Integer getCodeByUid(Integer uid){
//        //查询数据库，获取对应值，这里固定返回，省略步骤
//        return UserTypeEnum.INSIDE.getCode();
//    }
//}
