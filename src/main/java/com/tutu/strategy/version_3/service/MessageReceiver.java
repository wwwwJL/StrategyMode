package com.tutu.strategy.version_3.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tutu.strategy.version_3.service.modle.StrategyConsts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class MessageReceiver implements InitializingBean {

    /**
     * 当前各类型对应生效策略
     */
    public static Map<Integer, Integer> currentStrategy = new HashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        currentStrategy.put(UserTypeEnum.NEW.getCode(), StrategyConsts.newUserDiscountStrategy);
        currentStrategy.put(UserTypeEnum.COMMON.getCode(), StrategyConsts.commonUserDiscountStrategyA);
        currentStrategy.put(UserTypeEnum.ACTIVE.getCode(), StrategyConsts.activeUserDiscountStrategy);
        currentStrategy.put(UserTypeEnum.INSIDE.getCode(), StrategyConsts.insideUserDiscountStrategy);
    }

    /**
     * redis订阅的消费方法
     *
     * redis命令：publish test "{\"new_user\":1,\"common_user\":2,\"active_user\":3,\"inside_user\":4}"
     */
    public void receiveMessage(String message){
        Map<String, Integer> map = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            map = objectMapper.readValue(message,Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(map.containsKey("new_user")){
            currentStrategy.put(UserTypeEnum.NEW.getCode(),map.get("new_user"));
        }
        if(map.containsKey("common_user")){
            currentStrategy.put(UserTypeEnum.COMMON.getCode(),map.get("common_user"));
        }
        if(map.containsKey("active_user")){
            currentStrategy.put(UserTypeEnum.ACTIVE.getCode(),map.get("active_user"));
        }
        if(map.containsKey("inside_user")){
            currentStrategy.put(UserTypeEnum.INSIDE.getCode(),map.get("inside_user"));
        }
        log.info("配置发生变化,目前策略为:{}",currentStrategy);
    }
}