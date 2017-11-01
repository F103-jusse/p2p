package com.f103.it.pojo;

import java.sql.Timestamp;

public class FriendApplyRecord {

    private Integer id;

    private String farApplicant;

    private String farReceiver;

    private Timestamp farApplyTime;

    private Timestamp farReplyTime;

    private Short farStatus;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFarApplicant() {
        return this.farApplicant;
    }

    public void setFarApplicant(String farApplicant) {
        this.farApplicant = farApplicant;
    }

    public String getFarReceiver() {
        return this.farReceiver;
    }

    public void setFarReceiver(String farReceiver) {
        this.farReceiver = farReceiver;
    }

    public Timestamp getFarApplyTime() {
        return this.farApplyTime;
    }

    public void setFarApplyTime(Timestamp farApplyTime) {
        this.farApplyTime = farApplyTime;
    }

    public Timestamp getFarReplyTime() {
        return this.farReplyTime;
    }

    public void setFarReplyTime(Timestamp farReplyTime) {
        this.farReplyTime = farReplyTime;
    }

    public Short getFarStatus() {
        return this.farStatus;
    }

    public void setFarStatus(Short farStatus) {
        this.farStatus = farStatus;
    }
}