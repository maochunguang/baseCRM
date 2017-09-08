package com.koowo.entity.paycenter;

import java.math.BigDecimal;
import java.util.Date;

public class AdminOp {

     private Long id;
     private String adminUser;
     private Long accountId;
     private String opType;
     private BigDecimal cash;
     private String comment;
     private Date establishTime;

	/** minimal constructor */
    public AdminOp(String adminUser, String opType, Date establishTime) {
        this.adminUser = adminUser;
        this.opType = opType;
        this.establishTime = establishTime;
    }
    
    /** full constructor */
    public AdminOp(String adminUser, Long accountId, String opType, BigDecimal cash, String comment, Date establishTime) {
        this.adminUser = adminUser;
        this.accountId = accountId;
        this.opType = opType;
        this.cash = cash;
        this.comment = comment;
        this.establishTime = establishTime;
    }

   
    // Property accessors

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminUser() {
        return this.adminUser;
    }
    
    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public Long getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getOpType() {
        return this.opType;
    }
    
    public void setOpType(String opType) {
        this.opType = opType;
    }

    public BigDecimal getCash() {
        return this.cash;
    }
    
    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getEstablishTime() {
        return this.establishTime;
    }
    
    public void setEstablishTime(Date establishTime) {
        this.establishTime = establishTime;
    }
   








}