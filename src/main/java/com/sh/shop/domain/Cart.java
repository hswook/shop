package com.sh.shop.domain;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;

@Alias("Cart")
public class Cart {
	private BigDecimal productId;
	private BigDecimal productOrdersId;
	private String mainImg;
	private String name;
    private BigDecimal orderPrice;
    private BigDecimal quantity;
    private String state;
    
	public BigDecimal getProductId() {
		return productId;
	}
	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}
	public BigDecimal getProductOrdersId() {
		return productOrdersId;
	}
	public void setProductOrdersId(BigDecimal productOrdersId) {
		this.productOrdersId = productOrdersId;
	}
	public String getMainImg() {
		return mainImg;
	}
	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
