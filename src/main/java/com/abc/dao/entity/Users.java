package com.abc.dao.entity;

public class Users {
    private String uname;
    private String pas;

    public Users(String uname, String pas) {
        this.uname = uname;
        this.pas = pas;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }
}
