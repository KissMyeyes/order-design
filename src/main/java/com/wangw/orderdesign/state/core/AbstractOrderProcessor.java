package com.wangw.orderdesign.state.core;

import lombok.Data;

/**
 * 订单处理器
 *
 * /10/31 14:57
 **/
@Data
public abstract class AbstractOrderProcessor {

    int status;

    public abstract boolean process(String orderId, Object... params);
}
