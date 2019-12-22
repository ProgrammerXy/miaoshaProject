package com.miaoshaproject.service.model;

import java.math.BigDecimal;

//用户下单模型
public class OrderModel {
    //交易流水单号
    private String id;

    //用户id
    private Integer userId;

    //购买商品的单价,若promoId非空,则表示秒杀商品价格
    private BigDecimal itemPrice;

    //若非空,则表示是以秒杀商品方式下单
    private Integer promoId;

    //购买的商品id
    private Integer itemId;

    private Integer stock;

    //购买数量
    private Integer amount;

    //购买金额,若promoId非空,则表示秒杀商品价格
    private BigDecimal order_price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getOrder_price() {
        return order_price;
    }

    public void setOrder_price(BigDecimal order_price) {
        this.order_price = order_price;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }
}
