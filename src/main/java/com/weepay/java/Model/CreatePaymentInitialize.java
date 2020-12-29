package com.weepay.java.Model;

import com.weepay.java.Auth;
import com.weepay.java.HttpClient;
import com.weepay.java.weepayResource;
import com.weepay.java.Request.CreatePaymentRequest;

public class CreatePaymentInitialize extends weepayResource {
    public static CreatePaymentInitialize create(CreatePaymentRequest request, Auth options) {
        return HttpClient.create().post(options.getBaseUrl() + "/Payment/PaymentRequest",
                getHttpHeaders(request, options), request.getJsonObject(), CreatePaymentInitialize.class);
    }
}
