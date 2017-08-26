package com.koowo.entity.paycenter;

import java.util.Date;

public class AppealList{
	private Long id;
	private Long userId;
	private String userName;
	private Date appealTime;
	private String appealType;
	private Long receiptNumber;
	private String processingPerson;
	private Date processingTime;
	private Integer state;
	private String notPassedDesc;

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public Long getUserId(){
		return userId;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public Date getAppealTime(){
		return appealTime;
	}

	public void setAppealTime(Date appealTime){
		this.appealTime = appealTime;
	}

	public String getAppealType(){
		return appealType;
	}

	public void setAppealType(String appealType){
		this.appealType = appealType;
	}

	public Long getReceiptNumber(){
		return receiptNumber;
	}

	public void setReceiptNumber(Long receiptNumber){
		this.receiptNumber = receiptNumber;
	}

	public String getProcessingPerson(){
		return processingPerson;
	}

	public void setProcessingPerson(String processingPerson){
		this.processingPerson = processingPerson;
	}

	public Date getProcessingTime(){
		return processingTime;
	}

	public void setProcessingTime(Date processingTime){
		this.processingTime = processingTime;
	}

	public Integer getState(){
		return state;
	}

	public void setState(Integer state){
		this.state = state;
	}

	public String getNotPassedDesc(){
		return notPassedDesc;
	}

	public void setNotPassedDesc(String notPassedDesc){
		this.notPassedDesc = notPassedDesc;
	}

}
