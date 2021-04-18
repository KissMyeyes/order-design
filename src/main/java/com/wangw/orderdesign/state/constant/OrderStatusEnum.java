package com.wangw.orderdesign.state.constant;


/**
 * 这个应该是状态，而不是事件3
 */
public enum OrderStatusEnum {

    CREATE_EVENT(1, "创建订单"),
    FORMAL_EVENT(2, "正式订单"),
    NEED_PAY(3, "待支付"),
    PAY_DONE(4, "已支付"),
    ORDER_FINISHED(5, "订单已完成"),

    ORDER_CANCEL(6, "订单已取消");

    OrderStatusEnum(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public int status;

    public String desc;
}
