package com.weepay.java;

import org.json.JSONObject;

public class Auth extends BaseRequest {

	private int bayiId;
	private String apiKey;
	private String secretKey;
	private String baseUrl;

	public int getBayiId() {
		return bayiId;
	}

	public void setBayiId(int bayiId) {
		this.bayiId = bayiId;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public Object getJsonObject() {
		JSONObject auth = new JSONObject();
		auth.put("bayiId", this.bayiId);
		auth.put("apiKey", this.apiKey);
		auth.put("secretKey", this.secretKey);
		auth.put("baseUrl", this.baseUrl);
		return auth;
	}
}
