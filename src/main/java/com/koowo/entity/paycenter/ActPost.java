package com.koowo.entity.paycenter;

import java.io.Serializable;
import java.util.Date;

public class ActPost {
    private Long id;
	private Integer actType;//活动类型1指首页公告，2,3,4,5等分别指各个充值渠道的公告
	private Integer actFlag;//是否显示
	private String actName;
	private String actLink;
	private Date actTime;
	private Date updateTime;
	private String comments;
	private Integer actGenres;
	private Integer actRatio;

    public Integer getActFlag() {
		return actFlag;
	}
	public void setActFlag(Integer actFlag) {
		this.actFlag = actFlag;
	}
	public String getActLink() {
		return actLink;
	}
	public void setActLink(String actLink) {
		this.actLink = actLink;
	}
	public String getActName() {
		return actName;
	}
	public void setActName(String actName) {
		this.actName = actName;
	}
	public Date getActTime() {
		return actTime;
	}
	public void setActTime(Date actTime) {
		this.actTime = actTime;
	}
	public Integer getActType() {
		return actType;
	}
	public void setActType(Integer actType) {
		this.actType = actType;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getActGenres() {
		return actGenres;
	}
	public void setActGenres(Integer actGenres) {
		this.actGenres = actGenres;
	}
	public Integer getActRatio() {
		return actRatio;
	}
	public void setActRatio(Integer actRatio) {
		this.actRatio = actRatio;
	}
	
}
