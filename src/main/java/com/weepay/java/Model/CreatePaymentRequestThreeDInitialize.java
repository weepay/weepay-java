package com.weepay.java.Model;

import com.weepay.java.Auth;
import com.weepay.java.HttpClient;
import com.weepay.java.Request.CreatePaymentRequestThreeD;

public class CreatePaymentRequestThreeDInitialize extends CreatePaymentRequestThreeDInitializeResource {
    public static CreatePaymentRequestThreeDInitialize create(CreatePaymentRequestThreeD request, Auth options) {
        return HttpClient.create().post(options.getBaseUrl() + "/Payment/PaymentRequestThreeD",
                getHttpHeaders(request, options), request.getJsonObject(), CreatePaymentRequestThreeDInitialize.class);
    }
}
