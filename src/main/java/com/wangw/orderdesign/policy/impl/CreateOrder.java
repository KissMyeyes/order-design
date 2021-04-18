package com.wangw.orderdesign.policy.impl;

import com.wangw.orderdesign.policy.AbstractPolicy;
import com.wangw.orderdesign.state.model.Order;

public class CreateOrder extends AbstractPolicy {

    @Override
    public boolean updateBaseInfo(Order order) {
        return false;
    }

}
