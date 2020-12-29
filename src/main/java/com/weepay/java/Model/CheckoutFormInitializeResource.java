package com.weepay.java.Model;

import com.weepay.java.weepayResource;

public class CheckoutFormInitializeResource extends weepayResource {

    private String token;
    private String CheckoutFormData;
    private String tokenExpireTime;
    private String paymentPageUrl;
    private Object data;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCheckoutFormData() {
        return CheckoutFormData;
    }

    public void setCheckoutFormData(String CheckoutFormData) {
        this.CheckoutFormData = CheckoutFormData;
    }

    public String getTokenExpireTime() {
        return tokenExpireTime;
    }

    public void setTokenExpireTime(String tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime;
    }

    public String getPaymentPageUrl() {
        return paymentPageUrl;
    }

    public void setPaymentPageUrl(String paymentPageUrl) {
        this.paymentPageUrl = paymentPageUrl;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
