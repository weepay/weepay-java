# weepay-java

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/co.weepay/weepay-java/badge.svg)](https://maven-badges.herokuapp.com/maven-central/co.weepay/weepay-java/)

weepay integration for java

You can sign up or sign in for an weepay account at [https://weepay.co](https://weepay.co "https://weepay.co")

## Requirements
Java version 1.7 or newer


## Installation

### Maven installation

```xml
<dependency>
  <groupId>co.weepay</groupId>
  <artifactId>weepay-java</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Gradle installation
```groovy
compile "co.weepay:weepay-java:1.0.0"
```
### Other installation
If you use **Gradle Groovy DSL, Gradle Kotlin DSL, Scala SBT, Apache Ivy, Groovy Grape, Leiningen, Apache Buildr, Maven Central Badge, PURL,
Bazel** you should visit this page [maven.org](https://search.maven.org/artifact/co.weepay/weepay-java/) and select version.


You'll need to manually install the following JARs:

* The weepay JAR from https://github.com/weepay/weepay-java/releases/latest
* Gson 2.5 from com.google.code.gson
* Commons lang 3.4 from org.apache.commons
* Json 20180813 from org.json

## Build
If you don't have Maven installed in your local environment, you can use Maven Wrapper script:

```console
./mvnw clean install
```
## Usage
```Java
    //Auth
    Auth options = new Auth();

    options.setBayiId(bayiId);
    options.setApiKey("apiKey");
    options.setSecretKey("secretKey");
    options.setBaseUrl("https://api.weepay.co");

    // Request
    FormInitializeRequest request = new FormInitializeRequest();
    request.setOptions(options);
    request.setOrderId("1");
    request.setIpAddress("192.168.1.2");
    request.setPrice(35.50);
    request.setCurrency(Currency.TL.name());
    request.setLocale(Locale.TR.getValue());
    request.setDescription("Açıklama Alanı");
    request.setCallBackUrl("https://websitem.com/callback");
    request.setInstallmentNumber(1);
    request.setPaymentGroup(PaymentGroup.PRODUCT.name());
    request.setPaymentChannel(PaymentChannel.WEB.name());

    // Customer
    Customer customer = new Customer();
    customer.setCustomerId(1);
    customer.setCustomerName("isim");
    customer.setCustomerSurname("soyisim");
    customer.setGsmNumber("50XXXXXX");
    customer.setEmail("hello@weepay.co");
    customer.setIdentityNumber("00032222721");
    customer.setCity("istanbul");
    customer.setCountry("turkey");
    request.setCustomer(customer);

    // Address
    // Billing Address
    Address billingAddress = new Address();
    billingAddress.setContactName("isim soyisim");
    billingAddress.setAddress("address");
    billingAddress.setCity("city");
    billingAddress.setCountry("turkey");
    billingAddress.setZipCode("34164");
    request.setBillingAddress(billingAddress);

    // Address
    // Shipping Address
    Address shippingAddress = new Address();
    shippingAddress.setContactName("isim soyisim");
    shippingAddress.setAddress("address");
    shippingAddress.setCity("city");
    shippingAddress.setCountry("turkey");
    shippingAddress.setZipCode("34164");
    request.setShippingAddress(shippingAddress);

    // Products
    // First Product
    List<Product> products = new ArrayList<Product>();
    Product firstProduct = new Product();
    firstProduct.setName("Ürün bir");
    firstProduct.setProductId(1234);
    firstProduct.setProductPrice(0.10);
    firstProduct.setItemType(ProductType.PHYSICAL.name());
    products.add(firstProduct);

    // Second Product
    Product secondProduct = new Product();
    secondProduct.setName("Ürün iki");
    secondProduct.setProductId(4567);
    secondProduct.setProductPrice(0.10);
    secondProduct.setItemType(ProductType.PHYSICAL.name());
    products.add(secondProduct);
    request.setProducts(products);

    CheckoutFormInitialize payment = CheckoutFormInitialize.create(request, options);
    System.out.println(payment.getCheckoutFormData());
```

If you have any questions, please don't hesitate to contact us via Github with open an issue or contact us at destek@weepay.co.
