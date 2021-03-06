package com.koowo.entity.paycenter;

import java.math.BigDecimal;

public class Account {

    private Long id;
    private Long userId;
    private String userName;
    private BigDecimal cash;
    private BigDecimal cashTotal;
    private Integer state;
    private Integer payCnt;
    private Integer useCnt;
    private long giftTotal;
    private long dhqTotal;

    private Long gameunionTotal;

    /**
     * full constructor
     */
    public Account(Long userId, String userName, BigDecimal cash, BigDecimal cashTotal, Integer state, Integer payCnt, Integer useCnt) {
        this.userId = userId;
        this.userName = userName;
        this.cash = cash;
        this.cashTotal = cashTotal;
        this.state = state;
        this.payCnt = payCnt;
        this.useCnt = useCnt;
    }


    // Property accessors

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getCash() {
        return this.cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getCashTotal() {
        return this.cashTotal;
    }

    public void setCashTotal(BigDecimal cashTotal) {
        this.cashTotal = cashTotal;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPayCnt() {
        return this.payCnt;
    }

    public void setPayCnt(Integer payCnt) {
        this.payCnt = payCnt;
    }

    public Integer getUseCnt() {
        return this.useCnt;
    }

    public void setUseCnt(Integer useCnt) {
        this.useCnt = useCnt;
    }

    public long getGiftTotal() {
        return giftTotal;
    }

    public void setGiftTotal(long giftTotal) {
        this.giftTotal = giftTotal;
    }


    public Long getGameunionTotal() {
        return gameunionTotal;
    }


    public void setGameunionTotal(Long gameunionTotal) {
        this.gameunionTotal = gameunionTotal;
    }


    public long getDhqTotal() {
        return dhqTotal;
    }


    public void setDhqTotal(long dhqTotal) {
        this.dhqTotal = dhqTotal;
    }


}