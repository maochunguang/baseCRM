package com.koowo.entity.paycenter;

import java.util.Date;

public class BadAccount implements java.io.Serializable {

    private Integer id;
    private String userName;
    private String regTime;
    private String oldPasswords;
    private String idCode;
    private String psubas;
    private String payRecords;
    private String contact;
    private Integer authState;
    private Integer clearIdcode;
    private Integer resetPassword;
    private Integer dealState;
    private Date inputTime;
    private String stopauthReason;
    private String inputPerson;
    private String disposePerson;
    private Date disposeTime;
    // Constructors

    public String getInputPerson() {
        return inputPerson;
    }

    public void setInputPerson(String inputPerson) {
        this.inputPerson = inputPerson;
    }

    public String getStopauthReason() {
        return stopauthReason;
    }

    public void setStopauthReason(String stopauthReason) {
        this.stopauthReason = stopauthReason;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    /**
     * minimal constructor
     */
    public BadAccount(String userName) {
        this.userName = userName;
    }

    /**
     * full constructor
     */
    public BadAccount(String userName, String regTime, String oldPasswords,
                      String idCode, String psubas, String payRecords, String contact,
                      Integer authState, Integer clearIdcode, Integer resetPassword,
                      Integer dealState, Date inputTime) {
        this.userName = userName;
        this.regTime = regTime;
        this.oldPasswords = oldPasswords;
        this.idCode = idCode;
        this.psubas = psubas;
        this.payRecords = payRecords;
        this.contact = contact;
        this.authState = authState;
        this.clearIdcode = clearIdcode;
        this.resetPassword = resetPassword;
        this.dealState = dealState;
        this.inputTime = inputTime;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRegTime() {
        return this.regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getOldPasswords() {
        return this.oldPasswords;
    }

    public void setOldPasswords(String oldPasswords) {
        this.oldPasswords = oldPasswords;
    }

    public String getIdCode() {
        return this.idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getPsubas() {
        return this.psubas;
    }

    public void setPsubas(String psubas) {
        this.psubas = psubas;
    }

    public String getPayRecords() {
        return this.payRecords;
    }

    public void setPayRecords(String payRecords) {
        this.payRecords = payRecords;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getAuthState() {
        return this.authState;
    }

    public void setAuthState(Integer authState) {
        this.authState = authState;
    }

    public Integer getClearIdcode() {
        return this.clearIdcode;
    }

    public void setClearIdcode(Integer clearIdcode) {
        this.clearIdcode = clearIdcode;
    }

    public Integer getResetPassword() {
        return this.resetPassword;
    }

    public void setResetPassword(Integer resetPassword) {
        this.resetPassword = resetPassword;
    }

    public Integer getDealState() {
        return this.dealState;
    }

    public void setDealState(Integer dealState) {
        this.dealState = dealState;
    }

    public String getDisposePerson() {
        return disposePerson;
    }

    public void setDisposePerson(String disposePerson) {
        this.disposePerson = disposePerson;
    }

    public Date getDisposeTime() {
        return disposeTime;
    }

    public void setDisposeTime(Date disposeTime) {
        this.disposeTime = disposeTime;
    }

}