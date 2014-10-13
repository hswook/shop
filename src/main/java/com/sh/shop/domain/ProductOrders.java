package com.sh.shop.domain;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;

@Alias("ProductOrders")
public class ProductOrders {
    private BigDecimal id;

    private BigDecimal productId;

    private BigDecimal ordersId;

    private BigDecimal orderPrice;

    private BigDecimal quantity;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getProductId() {
        return productId;
    }

    public void setProductId(BigDecimal productId) {
        this.productId = productId;
    }

    public BigDecimal getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(BigDecimal ordersId) {
        this.ordersId = ordersId;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
}