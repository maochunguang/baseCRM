package com.koowo.entity.paycenter;

import java.util.Date;

/**
 * 自动生成的guid和uid进行绑定
 * 
 * @author wanglin
 * 
 */
public class GUidBandUid implements java.io.Serializable {
	private Long id;
	private Long userid;// kuwo用户id
	private String username;
	private Integer gid;
	private Integer sid;
	private Date cdate;
	private Date bdate;
	private String adtype;
	private String adposition;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String getAdtype() {
		return adtype;
	}

	public void setAdtype(String adtype) {
		this.adtype = adtype;
	}

	public String getAdposition() {
		return adposition;
	}

	public void setAdposition(String adposition) {
		this.adposition = adposition;
	}

}
