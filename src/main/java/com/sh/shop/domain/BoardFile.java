package com.sh.shop.domain;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;

@Alias("BoardFile")
public class BoardFile {
    private BigDecimal id;

    private BigDecimal postId;

    private String originalName;

    private String filePath;

    private BigDecimal downloadCount;

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

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName == null ? null : originalName.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public BigDecimal getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(BigDecimal downloadCount) {
        this.downloadCount = downloadCount;
    }
}