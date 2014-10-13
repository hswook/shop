package com.sh.shop.domain;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;

@Alias("Wishlist")
public class Wishlist {
    private BigDecimal id;

    private String memberEmail;

    private BigDecimal productId;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public BigDecimal getProductId() {
        return productId;
    }

    public void setProductId(BigDecimal productId) {
        this.productId = productId;
    }
}