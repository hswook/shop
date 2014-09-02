package com.sh.shop.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BoardConfig {
    private BigDecimal id;

    private String name;

    private String desciption;

    private String header;

    private String viewType;

    private String contentType;

    private BigDecimal categoryId;

    private Short useSecurity;

    private Short useUpload;

    private Short useComment;

    private Short useReply;

    private Short useSchedule;

    private Short usePostCategory;

    private String autholityRead;

    private String autholityWrite;

    private Date createTime;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption == null ? null : desciption.trim();
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType == null ? null : viewType.trim();
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }

    public BigDecimal getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(BigDecimal categoryId) {
        this.categoryId = categoryId;
    }

    public Short getUseSecurity() {
        return useSecurity;
    }

    public void setUseSecurity(Short useSecurity) {
        this.useSecurity = useSecurity;
    }

    public Short getUseUpload() {
        return useUpload;
    }

    public void setUseUpload(Short useUpload) {
        this.useUpload = useUpload;
    }

    public Short getUseComment() {
        return useComment;
    }

    public void setUseComment(Short useComment) {
        this.useComment = useComment;
    }

    public Short getUseReply() {
        return useReply;
    }

    public void setUseReply(Short useReply) {
        this.useReply = useReply;
    }

    public Short getUseSchedule() {
        return useSchedule;
    }

    public void setUseSchedule(Short useSchedule) {
        this.useSchedule = useSchedule;
    }

    public Short getUsePostCategory() {
        return usePostCategory;
    }

    public void setUsePostCategory(Short usePostCategory) {
        this.usePostCategory = usePostCategory;
    }

    public String getAutholityRead() {
        return autholityRead;
    }

    public void setAutholityRead(String autholityRead) {
        this.autholityRead = autholityRead == null ? null : autholityRead.trim();
    }

    public String getAutholityWrite() {
        return autholityWrite;
    }

    public void setAutholityWrite(String autholityWrite) {
        this.autholityWrite = autholityWrite == null ? null : autholityWrite.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}