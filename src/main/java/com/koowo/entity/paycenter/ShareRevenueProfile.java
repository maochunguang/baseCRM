package com.koowo.entity.paycenter;

public class ShareRevenueProfile {
	private Long id;
	private String channel;
	private Integer shareType;
	private Double ratio;
	private Long minRevenue;
	private Integer minType;
	private Long maxRevenue;
	private Integer maxType;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public Integer getShareType() {
		return shareType;
	}
	public void setShareType(Integer shareType) {
		this.shareType = shareType;
	}
	public Double getRatio() {
		return ratio;
	}
	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}
	public Long getMinRevenue() {
		return minRevenue;
	}
	public void setMinRevenue(Long minRevenue) {
		this.minRevenue = minRevenue;
	}
	public Integer getMinType() {
		return minType;
	}
	public void setMinType(Integer minType) {
		this.minType = minType;
	}
	public Long getMaxRevenue() {
		return maxRevenue;
	}
	public void setMaxRevenue(Long maxRevenue) {
		this.maxRevenue = maxRevenue;
	}
	public Integer getMaxType() {
		return maxType;
	}
	public void setMaxType(Integer maxType) {
		this.maxType = maxType;
	}
	
}
