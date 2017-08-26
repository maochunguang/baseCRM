package com.koowo.entity.paycenter;

import java.math.BigDecimal;
import java.util.Date;


/**
 * UseLog generated by MyEclipse - Hibernate Tools
 */

public class UseLog  implements java.io.Serializable {
	
	/*
	 * 说明：新添加类型后根据添加类型的单位(元角)修改如下统计
	 * 1.游戏消费查询/mg/useChannelLog.jsp
	 * 2.游戏消费查询（10天）/mg/useChannelLog10Day.jsp
	 * 3.财务对账查询 /mg/useChannelLogTotal.jsp
	 * 4.财务分成查询/mg/queryShareRevenue.jsp 
	 */
	public static Integer STATE_NORMAL = new Integer("0");
	public static Integer CONSUME_KWB=new Integer(0);//消费酷我币
	public static Integer CONSUME_GIFT_GAMEUNION=new Integer(1);//消费现金券
	public static Integer CONSUME_DHQ_GAMEUNION=new Integer(2);//消费酷豆
	public static Integer CONSUME_SCLB_GAMEUNION=new Integer(3);//一弹首冲礼包消费抵用券
	public static Integer CONSUME_YXCS_GIFT_GAMEUNION=new Integer(4);//游戏首充专题活动现金券
    // Fields     

     private Long id;
     private Long accountId;
     private Long fromAccountId;
     private String orderId;
     private String channel;
     private BigDecimal cash;
     private Date establishTime;
     private Integer state;
     private String comments;
     private String server;
     private String role;
     
     private Integer consumeType;

    // Constructors

    /** default constructor */
    public UseLog() {
    }

	/** minimal constructor */
    public UseLog(Long accountId, String channel, BigDecimal cash, Date establishTime, Integer state) {
        this.accountId = accountId;
        this.channel = channel;
        this.cash = cash;
        this.establishTime = establishTime;
        this.state = state;
    }
    
    /** full constructor */
    public UseLog(Long accountId, String orderId, String channel, BigDecimal cash, Date establishTime, Integer state, String comments) {
        this.accountId = accountId;
        this.orderId = orderId;
        this.channel = channel;
        this.cash = cash;
        this.establishTime = establishTime;
        this.state = state;
        this.comments = comments;
    }

    /**
     * 输出日志使用的格式
     * @return
     */
    public String asLogString(){
    	StringBuffer sb = new StringBuffer();
    	sb.append("consume "+(this.getConsumeType().intValue()==CONSUME_KWB.intValue()?"kwb":"gift")+" log:");
    	sb.append(this.accountId.longValue());
    	sb.append(" use ");
    	sb.append(this.cash.longValue());
    	sb.append(" at ");
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

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public Integer getConsumeType() {
		return consumeType;
	}

	public void setConsumeType(Integer consumeType) {
		this.consumeType = consumeType;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getFromAccountId() {
		return fromAccountId;
	}

	public void setFromAccountId(Long fromAccountId) {
		this.fromAccountId = fromAccountId;
	}
   








}