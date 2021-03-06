package com.koowo.entity.paycenter;

import java.util.Date;


/**
 * GiftRec generated by MyEclipse - Hibernate Tools
 */

public class GiftRec  implements java.io.Serializable {

	public static Integer STATE_NORMAL = new Integer("0");
	
	public static Integer DHQ_STATE_NORMAL = new Integer("9");
	//为了保持之前的现金券逻辑不便,并增加酷豆类型,故酷豆的状态设置为9 gid为4 

    // Fields    

     private Long id;
     private Long accountId;
     private Long giftId;
     private Date getTime;
     private Date overTime;
     private Long cash;
     private Long cashLeft;
     private Integer state;
     private String getDateStr;


    // Constructors

    /** default constructor */
    public GiftRec() {
    }

    
    /** full constructor */
    public GiftRec(Long accountId, Long giftId, Date getTime, Date overTime, Long cash, Long cashLeft, Integer state, String getDateStr) {
        this.accountId = accountId;
        this.giftId = giftId;
        this.getTime = getTime;
        this.overTime = overTime;
        this.cash = cash;
        this.cashLeft = cashLeft;
        this.state = state;
        this.getDateStr = getDateStr;
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

    public Long getGiftId() {
        return this.giftId;
    }
    
    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }

    public Date getGetTime() {
        return this.getTime;
    }
    
    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    public Date getOverTime() {
        return this.overTime;
    }
    
    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }

    public Long getCash() {
        return this.cash;
    }
    
    public void setCash(Long cash) {
        this.cash = cash;
    }

    public Integer getState() {
        return this.state;
    }
    
    public void setState(Integer state) {
        this.state = state;
    }

	public Long getCashLeft() {
		return cashLeft;
	}

	public void setCashLeft(Long cashLeft) {
		this.cashLeft = cashLeft;
	}

	public String getGetDateStr() {
		return getDateStr;
	}

	public void setGetDateStr(String getDateStr) {
		this.getDateStr = getDateStr;
	}
	

}