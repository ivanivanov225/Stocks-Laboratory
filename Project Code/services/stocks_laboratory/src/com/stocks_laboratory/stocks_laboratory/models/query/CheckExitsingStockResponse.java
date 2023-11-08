/*Copyright (c) 2023-2024 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.stocks_laboratory.stocks_laboratory.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class CheckExitsingStockResponse implements Serializable {


    @ColumnAlias("id")
    private Long id;

    @ColumnAlias("user_id")
    private Long userId;

    @ColumnAlias("stock_symbol")
    private String stockSymbol;

    @ColumnAlias("shares_owned")
    private Long sharesOwned;

    @ColumnAlias("purchase_price")
    private Double purchasePrice;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStockSymbol() {
        return this.stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public Long getSharesOwned() {
        return this.sharesOwned;
    }

    public void setSharesOwned(Long sharesOwned) {
        this.sharesOwned = sharesOwned;
    }

    public Double getPurchasePrice() {
        return this.purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CheckExitsingStockResponse)) return false;
        final CheckExitsingStockResponse checkExitsingStockResponse = (CheckExitsingStockResponse) o;
        return Objects.equals(getId(), checkExitsingStockResponse.getId()) &&
                Objects.equals(getUserId(), checkExitsingStockResponse.getUserId()) &&
                Objects.equals(getStockSymbol(), checkExitsingStockResponse.getStockSymbol()) &&
                Objects.equals(getSharesOwned(), checkExitsingStockResponse.getSharesOwned()) &&
                Objects.equals(getPurchasePrice(), checkExitsingStockResponse.getPurchasePrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getUserId(),
                getStockSymbol(),
                getSharesOwned(),
                getPurchasePrice());
    }
}