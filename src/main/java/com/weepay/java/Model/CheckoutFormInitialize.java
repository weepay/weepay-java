package com.weepay.java.Model;

import com.weepay.java.Auth;
import com.weepay.java.HttpClient;
import com.weepay.java.Request.FormInitializeRequest;

public class CheckoutFormInitialize extends CheckoutFormInitializeResource {

    public static CheckoutFormInitialize create(FormInitializeRequest request, Auth options) {
        return HttpClient.create().post(options.getBaseUrl() + "/Payment/PaymentCreate",
                getHttpHeaders(request, options), request.getJsonObject(), CheckoutFormInitialize.class);
    }

}
