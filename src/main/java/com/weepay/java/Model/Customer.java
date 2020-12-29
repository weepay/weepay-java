package com.weepay.java.Model;

import com.weepay.java.BaseRequest;

import org.json.JSONObject;

public class Customer extends BaseRequest {
    private int customerId;
    private String customerName;
    private String customerSurname;
    private String gsmNumber;
    private String email;
    private String identityNumber;
    private String city;
    private String country;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getGsmNumber() {
        return gsmNumber;
    }

    public void setGsmNumber(String gsmNumber) {
        this.gsmNumber = gsmNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Object getJsonObject() {
        JSONObject customer = new JSONObject();
        customer.put("customerId", this.customerId);
        customer.put("customerName", this.customerName);
        customer.put("customerSurname", this.customerSurname);
        customer.put("gsmNumber", this.gsmNumber);
        customer.put("email", this.email);
        customer.put("identityNumber", this.identityNumber);
        customer.put("city", this.city);
        customer.put("country", this.country);
        return customer;
    }

}
