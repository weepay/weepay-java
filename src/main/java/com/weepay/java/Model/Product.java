package com.weepay.java.Model;

import com.weepay.java.ToStringRequestBuilder;


public class Product  {
    private int productId;
    private String name;
    private double productPrice;
    private String itemType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .append("productId", productId)
                .append("name", name)
                .append("productPrice", productPrice)
                .append("itemType", itemType)
                .toString();
    }
}
