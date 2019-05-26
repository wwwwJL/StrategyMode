package com.tutu.strategy.version_1;

import org.springframework.stereotype.Component;

//@Component
//public class DiscountService {
//    /**
//     * 获取用户对应sku的折扣价
//     */
//    public Double getDiscountPriceByUid(Integer uid, Integer originalPrice){
//        //获取用户状态码
//        Integer userCode = getCodeByUid(uid);
//        Double discountPrice = null;
//        //判断用户身份，不同身份，折扣计算方式不同
//        if(userCode.equals(UserTypeEnum.NEW.getCode())){
//            System.out.println("该用户享受5折优惠！");
//            discountPrice = originalPrice * 0.5;
//        }
//        if(userCode.equals(UserTypeEnum.COMMON.getCode())){
//            System.out.println("该用户不享受优惠！");
//            discountPrice = originalPrice.doubleValue();
//        }
//        if(userCode.equals(UserTypeEnum.ACTIVE.getCode())){
//            System.out.println("该用户享受8折优惠！");
//            discountPrice = originalPrice * 0.8;
//        }
//        if(userCode.equals(UserTypeEnum.INSIDE.getCode())){
//            System.out.println("内部员工享受5折优惠！");
//            discountPrice = originalPrice * 0.5;
//        }
//        return discountPrice;
//    }
//
//    /**
//     * 获取用户对应的身份值
//     */
//    public Integer getCodeByUid(Integer uid){
//        //查询数据库，获取对应值，这里固定返回，省略步骤
//        return UserTypeEnum.COMMON.getCode();
//    }
//}
