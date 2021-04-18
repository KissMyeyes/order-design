package com.wangw.orderdesign.policy;

import com.wangw.orderdesign.state.model.Order;

/**
 * @author gaopeng@doctorwork.com
 * @description
 * -10-29 22:16
 **/
public abstract class AbstractPolicy {

    public abstract boolean updateBaseInfo(Order order);

    public boolean complateOtherInfo(Object... args) {
        return false;
    }
}
