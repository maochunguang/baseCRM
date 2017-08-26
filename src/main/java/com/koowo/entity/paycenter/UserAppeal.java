package com.koowo.entity.paycenter;

import java.util.Date;

public class UserAppeal{
	private Long id;
	private Long appealId;
	private Long userId;
	private String userName;
	private String idCode;
	private String idCodePic1;
	private String idCodePic2;
	private String realName;
	private String phone;
	private String email;
	private String oldPwd1;
	private String oldPwd2;
	private String oldPwd3;
	private Date regTime;
	private String regCity;
	private Long gid;
	private Integer sid;
	private String roleLevel;
	private String roleName;
	private String accountDesc;
	private String loginPlace1;
	private String loginPlace2;
	private Long lastPayCash;
	private String payLogDesc;

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public Long getAppealId(){
		return appealId;
	}

	public void setAppealId(Long appealId){
		this.appealId = appealId;
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

	public String getIdCode(){
		return idCode;
	}

	public void setIdCode(String idCode){
		this.idCode = idCode;
	}

	public String getIdCodePic1(){
		return idCodePic1;
	}

	public void setIdCodePic1(String idCodePic1){
		this.idCodePic1 = idCodePic1;
	}

	public String getIdCodePic2(){
		return idCodePic2;
	}

	public void setIdCodePic2(String idCodePic2){
		this.idCodePic2 = idCodePic2;
	}

	public String getRealName(){
		return realName;
	}

	public void setRealName(String realName){
		this.realName = realName;
	}

	public String getPhone(){
		return phone;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getOldPwd1(){
		return oldPwd1;
	}

	public void setOldPwd1(String oldPwd1){
		this.oldPwd1 = oldPwd1;
	}

	public String getOldPwd2(){
		return oldPwd2;
	}

	public void setOldPwd2(String oldPwd2){
		this.oldPwd2 = oldPwd2;
	}

	public String getOldPwd3(){
		return oldPwd3;
	}

	public void setOldPwd3(String oldPwd3){
		this.oldPwd3 = oldPwd3;
	}

	public Date getRegTime(){
		return regTime;
	}

	public void setRegTime(Date regTime){
		this.regTime = regTime;
	}

	public String getRegCity(){
		return regCity;
	}

	public void setRegCity(String regCity){
		this.regCity = regCity;
	}

	public Long getGid(){
		return gid;
	}

	public void setGid(Long gid){
		this.gid = gid;
	}

	public Integer getSid(){
		return sid;
	}

	public void setSid(Integer sid){
		this.sid = sid;
	}

	public String getRoleLevel(){
		return roleLevel;
	}

	public void setRoleLevel(String roleLevel){
		this.roleLevel = roleLevel;
	}

	public String getRoleName(){
		return roleName;
	}

	public void setRoleName(String roleName){
		this.roleName = roleName;
	}

	public String getAccountDesc(){
		return accountDesc;
	}

	public void setAccountDesc(String accountDesc){
		this.accountDesc = accountDesc;
	}

	public String getLoginPlace1(){
		return loginPlace1;
	}

	public void setLoginPlace1(String loginPlace1){
		this.loginPlace1 = loginPlace1;
	}

	public String getLoginPlace2(){
		return loginPlace2;
	}

	public void setLoginPlace2(String loginPlace2){
		this.loginPlace2 = loginPlace2;
	}

	public Long getLastPayCash(){
		return lastPayCash;
	}

	public void setLastPayCash(Long lastPayCash){
		this.lastPayCash = lastPayCash;
	}

	public String getPayLogDesc(){
		return payLogDesc;
	}

	public void setPayLogDesc(String payLogDesc){
		this.payLogDesc = payLogDesc;
	}

}
