package com.koowo.entity.paycenter;

public class LoginHistory {

    private Long id;
    private Integer uid;
    private Long gid;
    private String sid;
    private String loginSrc;

    public LoginHistory(Integer uid, Long gid, String sid) {
        this.uid = uid;
        this.gid = gid;
        this.sid = sid;
    }


    // Property accessors

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Long getGid() {
        return this.gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getSid() {
        return this.sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }


    public void setLoginSrc(String loginSrc) {
        this.loginSrc = loginSrc;
    }


}