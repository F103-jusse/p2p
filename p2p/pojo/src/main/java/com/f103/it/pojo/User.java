package com.f103.it.pojo;

import java.sql.Timestamp;

public class User {

    private Integer userId;

    private String userPassword;

    private String userNickName;

    private String userPhone;

    private Timestamp userRegisterTime;

    private Short userStatus;

    private String userLoginIP;

    private Timestamp userLoginTime;

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickName() {
        return this.userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserPhone() {
        return this.userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Timestamp getUserRegisterTime() {
        return this.userRegisterTime;
    }

    public void setUserRegisterTime(Timestamp userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public Short getUserStatus() {
        return this.userStatus;
    }

    public void setUserStatus(Short userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserLoginIP() {
        return this.userLoginIP;
    }

    public void setUserLoginIP(String userLoginIP) {
        this.userLoginIP = userLoginIP;
    }

    public Timestamp getUserLoginTime() {
        return this.userLoginTime;
    }

    public void setUserLoginTime(Timestamp userLoginTime) {
        this.userLoginTime = userLoginTime;
    }
}