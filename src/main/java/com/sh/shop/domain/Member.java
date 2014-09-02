package com.sh.shop.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("Member")
public class Member {
    private String email;

    private String pw;

    private String name;

    private String type;

    private String useYn;

    private Date joindt;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw == null ? null : pw.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn == null ? null : useYn.trim();
    }

    public Date getJoindt() {
        return joindt;
    }

    public void setJoindt(Date joindt) {
        this.joindt = joindt;
    }
}