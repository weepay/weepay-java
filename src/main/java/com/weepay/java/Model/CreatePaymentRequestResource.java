package com.weepay.java.Model;

import com.weepay.java.weepayResource;

public class CreatePaymentRequestResource extends weepayResource {

    private boolean paymentStatus;
    private String paymentId;

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

}
