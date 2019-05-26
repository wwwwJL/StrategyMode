package com.tutu.strategy.version_2.modle;

//import com.tutu.strategy.version_2.UserTypeEnum;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public enum DiscountStrategyEnum {
//    NEWDiscountStrategy(UserTypeEnum.NEW.getCode(),"newUserDiscountStrategy"),
//    COMMONDiscountStrategy(UserTypeEnum.COMMON.getCode(),"commonUserDiscountStrategy"),
//    ACTIVEDiscountStrategy(UserTypeEnum.ACTIVE.getCode(),"activeUserDiscountStrategy"),
//    INSIDEDiscountStrategy(UserTypeEnum.INSIDE.getCode(),"insideUserDiscountStrategy");
//
//    private Integer code;
//    private String beanId;
//
//    public static Map<Integer, String> typeMap = new HashMap();
//
//    DiscountStrategyEnum(Integer code, String beanId){
//        this.code = code;
//        this.beanId = beanId;
//    }
//
//    static {
//        for(DiscountStrategyEnum status : DiscountStrategyEnum.values()){
//            typeMap.put(status.getCode(), status.getBeanId());
//        }
//    }
//
//    public Integer getCode() {
//        return code;
//    }
//
//    public void setCode(Integer code) {
//        this.code = code;
//    }
//
//    public String getBeanId() {
//        return beanId;
//    }
//
//    public void setBeanId(String beanId) {
//        this.beanId = beanId;
//    }
//}
