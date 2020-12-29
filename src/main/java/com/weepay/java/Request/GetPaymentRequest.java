package com.weepay.java.Request;

import com.weepay.java.Auth;
import com.weepay.java.BaseRequest;
import com.weepay.java.ToStringRequestBuilder;

import org.json.JSONObject;

public class GetPaymentRequest extends BaseRequest {

	private String orderId;
	private String paymentId;
	private Auth options;
	private String locale;

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public Auth getOptions() {
		return options;
	}

	public void setOptions(Auth options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return new ToStringRequestBuilder(this)
				.appendSuper(super.toString())
				.append("orderId", this.orderId)
				.append("paymentId", this.paymentId)
				.append("locale", this.locale).toString();
	}

	public JSONObject getJsonObject() {
		JSONObject main = new JSONObject();
		JSONObject data = new JSONObject();
		data.put("orderId", this.orderId);
		data.put("paymentId", this.paymentId);
		main.put("Data", data);
		main.put("Auth", this.getOptions().getJsonObject());

		return main;
	}

}
