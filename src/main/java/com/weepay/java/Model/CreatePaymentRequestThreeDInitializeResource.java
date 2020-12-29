package com.weepay.java.Model;

import com.weepay.java.weepayResource;

public class CreatePaymentRequestThreeDInitializeResource extends weepayResource {
    private String threeDSecureUrl;

    public String getThreeDSecureUrl() {
        return threeDSecureUrl;
    }

    public void setThreeDSecureUrl(String threeDSecureUrl) {
        this.threeDSecureUrl = threeDSecureUrl;
    }

}
