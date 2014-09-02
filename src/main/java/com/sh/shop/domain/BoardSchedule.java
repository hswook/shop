package com.sh.shop.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BoardSchedule {
    private BigDecimal id;

    private BigDecimal postId;

    private Date startTime;

    private Date endTime;

    private String location;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getPostId() {
        return postId;
    }

    public void setPostId(BigDecimal postId) {
        this.postId = postId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
}