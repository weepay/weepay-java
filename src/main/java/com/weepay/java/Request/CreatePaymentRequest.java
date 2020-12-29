package com.weepay.java.Request;

import java.util.List;

import com.weepay.java.Auth;
import com.weepay.java.BaseRequest;
import com.weepay.java.ToStringRequestBuilder;
import com.weepay.java.Model.Address;
import com.weepay.java.Model.Customer;
import com.weepay.java.Model.Product;

import org.json.JSONObject;

public class CreatePaymentRequest extends BaseRequest {
    private String orderId;
    private String ipAddress;
    private double paidPrice;
    private String currency;
    private String locale;
    private int installmentNumber;
    private String cardHolderName;
    private String cardNumber;
    private String expireMonth;
    private String expireYear;
    private String cvcNumber;
    private String description;
    private String paymentGroup;
    private String paymentSource;
    private String paymentChannel;
    private int preAuth;
    private String cardUserKey;
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private List<Product> products;
    private Auth options;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public double getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(double paidPrice) {
        this.paidPrice = paidPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public int getInstallmentNumber() {
        return installmentNumber;
    }

    public void setInstallmentNumber(int installmentNumber) {
        this.installmentNumber = installmentNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getexpireMonth() {
        return expireMonth;
    }

    public void setexpireMonth(String expireMonth) {
        this.expireMonth = expireMonth;
    }

    public String getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(String expireYear) {
        this.expireYear = expireYear;
    }

    public String getCvcNumber() {
        return cvcNumber;
    }

    public void setCvcNumber(String cvcNumber) {
        this.cvcNumber = cvcNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaymentGroup() {
        return paymentGroup;
    }

    public void setPaymentGroup(String paymentGroup) {
        this.paymentGroup = paymentGroup;
    }

    public String getPaymentSource() {
        return paymentSource;
    }

    public void setPaymentSource(String paymentSource) {
        this.paymentSource = paymentSource;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public int getPreAuth() {
        return preAuth;
    }

    public void setPreAuth(int preAuth) {
        this.preAuth = preAuth;
    }

    public String getCardUserKey() {
        return cardUserKey;
    }

    public void setCardUserKey(String cardUserKey) {
        this.cardUserKey = cardUserKey;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Auth getOptions() {
        return options;
    }

    public void setOptions(Auth options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this).appendSuper(super.toString()).append("orderId", this.orderId)
                .append("ipAddress", this.ipAddress).append("paidPrice", this.paidPrice)
                .append("currency", this.currency).append("locale", this.locale)
                .append("installmentNumber", this.installmentNumber).append("cardHolderName", this.cardHolderName)
                .append("cardNumber", this.cardNumber).append("expireMonth", this.expireMonth)
                .append("expireYear", this.expireYear).append("cvcNumber", this.cvcNumber)
                .append("description", this.description).append("paymentGroup", this.paymentGroup)
                .append("paymentSource", this.paymentSource).append("paymentChannel", this.paymentChannel)
                .append("preAuth", this.preAuth).append("cardUserKey", this.cardUserKey)
                .append("customer", this.customer).append("shippingAddress", this.shippingAddress)
                .append("billingAddress", this.billingAddress).append("products", this.products)
                .append("options", this.options).toString();
    }

    public JSONObject getJsonObject() {
        JSONObject main = new JSONObject();
        JSONObject data = new JSONObject();

        data.put("orderId", this.orderId);
        data.put("ipAddress", this.ipAddress);
        data.put("paidPrice", this.paidPrice);
        data.put("currency", this.currency);
        data.put("locale", this.locale);
        data.put("installmentNumber", this.installmentNumber);
        data.put("cardHolderName", this.cardHolderName);
        data.put("cardNumber", this.cardNumber);
        data.put("expireMonth", this.expireMonth);
        data.put("expireYear", this.expireYear);
        data.put("cvcNumber", this.cvcNumber);
        data.put("description", this.description);
        data.put("paymentGroup", this.paymentGroup);
        data.put("paymentSource", this.paymentSource);
        data.put("paymentChannel", this.paymentChannel);
        data.put("preAuth", this.preAuth);
        data.put("cardUserKey", this.cardUserKey);
        main.put("Auth", this.getOptions().getJsonObject());
        main.put("Data", data);
        main.put("Customer", this.getCustomer().getJsonObject());
        main.put("ShippingAddress", this.getShippingAddress().getJsonObject());
        main.put("BillingAddress", this.getShippingAddress().getJsonObject());
        main.put("Products", this.getProducts());
        return main;
    }

}
