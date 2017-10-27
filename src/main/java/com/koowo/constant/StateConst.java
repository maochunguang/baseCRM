package com.koowo.constant;

/**
 * Created by mao on 2017/9/8.
 */
public class StateConst {
    public static final Integer ACCOUNT_TATE_NORMAL = new Integer("0");
    public static final Integer ACCOUNT_STATE_BAN = new Integer("1");
    public static final int AWARD_STATE_HASGOT = 1;
    public static final int AWARD_STATE_NOTGOT = 0;
    /**
     * 已经正常结束的记录
     */
    public static final Integer PAYLOG_STATE_NORMAL = new Integer("0");
    /**
     * 正在等待支付的记录
     */
    public static final Integer PAYLOG_STATE_WAIT = new Integer("1");

    //待处理
    public static final Integer PAYORDER_PAYSTATE_WAIT = new Integer("0");
    //已成功
    public static final Integer PAYORDER_STATE_USED = new Integer("1");
    //管理员手动处理
    public static final Integer PAYORDER_STATE_ADMIN_MOD = new Integer("2");

}
