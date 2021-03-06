package com.koowo.entity.paycenter;

import java.math.BigDecimal;
import java.util.Date;


public class PayLog {

    private Long id;
    private Long accountId;
    private Long fromAccountId;
    private String orderId;
    private String channel;
    private BigDecimal cash;
    private Date establishTime;
    private Integer state;
    private String comments;

    /**
     * minimal constructor
     */
    public PayLog(Long accountId, String channel, BigDecimal cash, Date establishTime, Integer state) {
        this.accountId = accountId;
        this.channel = channel;
        this.cash = cash;
        this.establishTime = establishTime;
        this.state = state;
    }

    /**
     * full constructor
     */
    public PayLog(Long accountId, String orderId, String channel, BigDecimal cash, Date establishTime, Integer state, String comments) {
        this.accountId = accountId;
        this.orderId = orderId;
        this.channel = channel;
        this.cash = cash;
        this.establishTime = establishTime;
        this.state = state;
        this.comments = comments;
    }

    /**
     * 日志格式输出
     *
     * @return
     */
    public String asLogString() {
        StringBuffer sb = new StringBuffer();
        sb.append("pay log:");
        sb.append(this.accountId.longValue());
        sb.append(" pays ");
        sb.append(this.cash.longValue());
        sb.append(" from ");
        sb.append(this.channel);
        sb.append(" as ");
        sb.append(this.orderId);
        sb.append("|");
        return sb.toString();
    }


    // Property accessors

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public BigDecimal getCash() {
        return this.cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public Date getEstablishTime() {
        return this.establishTime;
    }

    public void setEstablishTime(Date establishTime) {
        this.establishTime = establishTime;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Long getFromAccountId() {
        return fromAccountId;
    }

    public void setFromAccountId(Long fromAccountId) {
        this.fromAccountId = fromAccountId;
    }


}