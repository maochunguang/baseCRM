package com.koowo.entity.paycenter;


public class UserPaymentToken implements java.io.Serializable {

	private Long id;
	private Long userId;
	private String token;
	private short payTypeId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public short getPayTypeId() {
		return payTypeId;
	}

	public void setPayTypeId(short payTypeId) {
		this.payTypeId = payTypeId;
	}
	
	public UserPaymentToken() {
		super();
	}
	
	public UserPaymentToken(Long userId, String token, short payTypeId) {
		super();
		this.userId = userId;
		this.token = token;
		this.payTypeId = payTypeId;
	}

}