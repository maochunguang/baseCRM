package com.koowo.entity.paycenter;

import java.io.Serializable;

/**
 * 易宝分账信息
 * @author admin
 *
 */
public class YpDivideInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String createTime;
	private String requestNo;
	private String merchantNo;
	private String divideDetail;
	private String serverCallbackUrl;
	private String trxRequestNo;
	private Integer times;		//重发次数
	private Integer state;		//订单状态	0-失败	1-成功
	private String sendTime;	//重发时间
	
	public YpDivideInfo() {
	}

	public YpDivideInfo(int id,String createTime, String requestNo, String merchantNo, String divideDetail,
			String serverCallbackUrl, String trxRequestNo,Integer times,Integer state,String sendTime) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.requestNo = requestNo;
		this.merchantNo = merchantNo;
		this.divideDetail = divideDetail;
		this.serverCallbackUrl = serverCallbackUrl;
		this.trxRequestNo = trxRequestNo;
		this.times = times;
		this.state = state;
		this.sendTime = sendTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getDivideDetail() {
		return divideDetail;
	}

	public void setDivideDetail(String divideDetail) {
		this.divideDetail = divideDetail;
	}

	public String getServerCallbackUrl() {
		return serverCallbackUrl;
	}

	public void setServerCallbackUrl(String serverCallbackUrl) {
		this.serverCallbackUrl = serverCallbackUrl;
	}

	public String getTrxRequestNo() {
		return trxRequestNo;
	}

	public void setTrxRequestNo(String trxRequestNo) {
		this.trxRequestNo = trxRequestNo;
	}

	public Integer getTimes() {
		return times;
	}

	public void setTimes(Integer times) {
		this.times = times;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	
	
}
