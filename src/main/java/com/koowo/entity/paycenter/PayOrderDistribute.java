package com.koowo.entity.paycenter;

import java.util.Date;

public class PayOrderDistribute {

	// 待处理
	public static Integer STATE_WAIT = new Integer("0");
	// 已成功
	public static Integer STATE_FINNISH = new Integer("1");

	// Fields

	private Long id;
	/**
	 * 订单号
	 */
	private String orderId;
	/**
	 * 渠道
	 */
	private String channel;
	/**
	 * 订单金额
	 */
	private Long cash;
	/**
	 * 分账的明细
	 */
	private String details;

	/**
	 * 交易流水号
	 */
	private String comments;

	/**
	 * 建立时间
	 */
	private Date establishTime;

	/**
	 * 回调时间
	 */
	private Date callBackTime;

	/**
	 * 分账状态
	 */
	private Integer state;
	
	/**
	 * 分账返回的状态值
	 */
	private String distrbuteValue;
	
	/**
	 * 易宝返回的支付时间
	 */
	private String returnPayDate;
	
	/**
	 * 酷我账户里面分到的钱
	 */
	private Double kuwoCash;

	public static Integer getSTATE_WAIT() {
		return STATE_WAIT;
	}

	public static void setSTATE_WAIT(Integer sTATE_WAIT) {
		STATE_WAIT = sTATE_WAIT;
	}

	public static Integer getSTATE_FINNISH() {
		return STATE_FINNISH;
	}

	public static void setSTATE_FINNISH(Integer sTATE_FINNISH) {
		STATE_FINNISH = sTATE_FINNISH;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Long getCash() {
		return cash;
	}

	public void setCash(Long cash) {
		this.cash = cash;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getEstablishTime() {
		return establishTime;
	}

	public void setEstablishTime(Date establishTime) {
		this.establishTime = establishTime;
	}

	public Date getCallBackTime() {
		return callBackTime;
	}

	public void setCallBackTime(Date callBackTime) {
		this.callBackTime = callBackTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}	
	
	public String getDistrbuteValue() {
		return distrbuteValue;
	}

	public void setDistrbuteValue(String distrbuteValue) {
		this.distrbuteValue = distrbuteValue;
	}	
	
	public String getReturnPayDate() {
		return returnPayDate;
	}

	public void setReturnPayDate(String returnPayDate) {
		this.returnPayDate = returnPayDate;
	}	
	
	public Double getKuwoCash() {
		return kuwoCash;
	}

	public void setKuwoCash(Double kuwoCash) {
		this.kuwoCash = kuwoCash;
	}	
}