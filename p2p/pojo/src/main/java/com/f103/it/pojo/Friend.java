package com.f103.it.pojo;

import java.util.Date;

public class Friend {
    private Integer id;

    private String fApplicant;

    private String fReceiver;

    private Date fRegisterTime;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfApplicant() {
        return this.fApplicant;
    }

    public void setfApplicant(String fApplicant) {
        this.fApplicant = fApplicant;
    }

    public String getfReceiver() {
        return this.fReceiver;
    }

    public void setfReceiver(String fReceiver) {
        this.fReceiver = fReceiver;
    }

    public Date getfRegisterTime() {
        return this.fRegisterTime;
    }

    public void setfRegisterTime(Date fRegisterTime) {
        this.fRegisterTime = fRegisterTime;
    }
}