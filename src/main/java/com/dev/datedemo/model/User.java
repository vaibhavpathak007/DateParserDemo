package com.dev.datedemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class User {

    private String userName;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date doj;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }
}
