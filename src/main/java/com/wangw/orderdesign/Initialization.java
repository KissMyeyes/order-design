package com.wangw.orderdesign;


import com.wangw.orderdesign.state.core.AbstractOrderOperator;
import com.wangw.orderdesign.state.core.AbstractOrderProcessor;
import com.wangw.orderdesign.state.core.OrderStateManager;
import com.wangw.orderdesign.state.core.annotation.OrderOperator;
import com.wangw.orderdesign.state.core.annotation.OrderProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Initialization implements BeanPostProcessor {

    @Resource
    OrderStateManager manager;

    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof AbstractOrderOperator && bean.getClass().isAnnotationPresent(OrderOperator.class) ) {
            AbstractOrderOperator orderState = (AbstractOrderOperator) bean;
            manager.orderOperatorMaps.put(orderState.getStatus(), orderState);
        }
        if (bean instanceof AbstractOrderProcessor && bean.getClass().isAnnotationPresent(OrderProcessor.class) ) {
            AbstractOrderProcessor orderProcessor = (AbstractOrderProcessor) bean;
            manager.orderProcessorMaps.put(orderProcessor.getStatus(), orderProcessor);
        }
        return bean;
    }
}