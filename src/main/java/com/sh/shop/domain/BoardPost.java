package com.sh.shop.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BoardPost {
    private BigDecimal id;

    private BigDecimal parentId;

    private BigDecimal orderSeq;

    private BigDecimal depth;

    private BigDecimal configId;

    private String postCategory;

    private String memberEmail;

    private String email;

    private String title;

    private String link;

    private Short isSecurity;

    private Short isNotice;

    private BigDecimal readCount;

    private Date createTime;

    private Date removeTime;

    private String content;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getParentId() {
        return parentId;
    }

    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
    }

    public BigDecimal getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(BigDecimal orderSeq) {
        this.orderSeq = orderSeq;
    }

    public BigDecimal getDepth() {
        return depth;
    }

    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    public BigDecimal getConfigId() {
        return configId;
    }

    public void setConfigId(BigDecimal configId) {
        this.configId = configId;
    }

    public String getPostCategory() {
        return postCategory;
    }

    public void setPostCategory(String postCategory) {
        this.postCategory = postCategory == null ? null : postCategory.trim();
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Short getIsSecurity() {
        return isSecurity;
    }

    public void setIsSecurity(Short isSecurity) {
        this.isSecurity = isSecurity;
    }

    public Short getIsNotice() {
        return isNotice;
    }

    public void setIsNotice(Short isNotice) {
        this.isNotice = isNotice;
    }

    public BigDecimal getReadCount() {
        return readCount;
    }

    public void setReadCount(BigDecimal readCount) {
        this.readCount = readCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(Date removeTime) {
        this.removeTime = removeTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}