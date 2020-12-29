package com.weepay.java.Model;

import com.weepay.java.Auth;
import com.weepay.java.HttpClient;
import com.weepay.java.Request.GetPaymentRequest;

public class GetPaymentModel extends GetPaymentResource {

    public static GetPaymentModel create(GetPaymentRequest request, Auth options) {
        return HttpClient.create().post(options.getBaseUrl() + "/GetPayment/Detail", getHttpHeaders(request, options),
                request.getJsonObject(), GetPaymentModel.class);
    }

}