package com.wangw.orderdesign.state.core;

import com.wangw.orderdesign.state.constant.OrderStatusEnum;
import lombok.Data;

@Data
public abstract class AbstractOrderOperator {

    int status;

    public abstract int handleEvent(int orderStatus, OrderStatusEnum orderStatusEnum);
}
