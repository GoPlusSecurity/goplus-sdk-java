# GoPlus API SDK for Java

### Environmental Preparation

---

JDK >= 1.8

### Installation

---

```xml
<dependency>
    <groupId>io.gopluslabs</groupId>
    <artifactId>goplus-sdk-java</artifactId>
    <version>0.1.0</version>
</dependency>
```

### Description

---

1.After the `GoPlusTemplate.getAccessToken` method is executed, the accessToken will be passed in for each function by default. When receiving error code 4022, you need to call `GoPlusTemplate.getAccessToken` again.

2.Each function can set its timeout by construction method(The default timeout is 10000ms).

3.`GoPlusTemplate.approvalSecurity`、 `GoPlusTemplate.nftSecurity` and `GoPlusTemplate.rugpullDetecting` may return error code 2, it means partial data obtained, the complete data can be requested again in about 15 seconds.

### Quick Start

---


#### Sign Method

```java
    public void getSign() throws ApiException {

        String appKey = "";
        String appSecret = "";
        Long time = System.currentTimeMillis()/1000;
        
        String sign = SignatureOauth.signatureSha1(appKey, time, appSecret);
        System.out.println(sign);
        
    }
```
#### GetAccessToken

````java
    public void getAccessToken() throws ApiException {
    
        AccessTokenRequest of = AccessTokenRequest.of(appKey, sign, time, 1000);
        System.out.println(GoPlusClient.getAccessToken(of));
        
    }
````

#### SupportedChains

```java
   public void supportedChains() throws ApiException {

        SupportedChainsRequest of = SupportedChainsRequest.of(
                "address_security",
                accessToken
        );
        System.out.println(GoPlusClient.supportedChains(of));
        
    }
```

#### TokenSecurity

```java
    public void tokenSecurity() throws ApiException {
    
        TokenSecurityRequest of = TokenSecurityRequest.of(
                "1",
                "0x408e41876cccdc0f92210600ef50372656052a38",
                1000
        );
        System.out.println(GoPlusClient.tokenSecurity(of));
        
    }
```

#### AddressSecurity

```java
    public void addressSecurity() throws ApiException {
    
        AddressSecurityRequest of = AddressSecurityRequest.of(
                "1",
                "0x408e41876cccdc0f92210600ef50372656052a38",
                1000
        );
        System.out.println(GoPlusClient.addressSecurity(of));
        
    }
```

#### ApprovalSecurity

```java
    public void approvalSecurity() throws ApiException {
    
        ApprovalSecurityRequest of = ApprovalSecurityRequest.of(
                "1",
                "0x408e41876cccdc0f92210600ef50372656052a38",
                1000
        );
        System.out.println(GoPlusClient.approvalSecurity(of));
        
    }
```

#### Erc20ApprovalSecurity

```java
    public void erc20ApprovalSecurity() throws ApiException {
    
        Erc20ApprovalSecurityRequest of = Erc20ApprovalSecurityRequest.of(
                "56",
                "0xd018e2b543a2669410537f96293590138cacedf3",
                1000
        );
        System.out.println(GoPlusClient.erc20ApprovalSecurity(of));
        
    }

```

#### Erc721ApprovalSecurity

```java
    public void erc721ApprovalSecurity() throws ApiException {
    
        Erc721ApprovalSecurityRequest of = Erc721ApprovalSecurityRequest.of(
                "1",
                "0xd95dbdab08a9fed2d71ac9c3028aac40905d8cf3",
                5000
        );
        System.out.println(GoPlusClient.erc721ApprovalSecurity(of));
        
    }
```

#### Erc1155ApprovalSecurity

```java
    public void erc1155ApprovalSecurity() throws ApiException {
    
        Erc1155ApprovalSecurityRequest of = Erc1155ApprovalSecurityRequest.of(
                "56",
                "0xb0dccbb9c4a65a94a41a0165aaea79c8b2fc54ce",
                1000
        );
        System.out.println(GoPlusClient.erc1155ApprovalSecurity(of));
        
    }
```

#### InputDecode

```java
    public void inputDecode() throws ApiException {
    
        InputDecodeRequest of = InputDecodeRequest.of(
                "1",
                "0x4cc8aa0c6ffbe18534584da9b592aa438733ee66",
                "0xa0712d680000000000000000000000000000000000000000000000000000000062fee481",
                1000
        );
        System.out.println(GoPlusClient.inputDecode(of));
        
    }

```

#### NftSecurity

```java
    public void nftSecurity() throws ApiException {
    
        NftSecurityRequest of = NftSecurityRequest.of(
                "1",
                "0x11450058d796b02eb53e65374be59cff65d3fe7f",
                null,
                1000
        );
        System.out.println(GoPlusClient.nftSecurity(of));
        
    }
```

#### DappSecurity

```java
    public void dappSecurity() throws ApiException {
    
        DappSecurityRequest of = DappSecurityRequest.of("https://for.tube", 1000);
        System.out.println(GoPlusClient.dappSecurity(of));
        
    }

```

#### PhishingSite

```java
    public void phishingSite() throws ApiException {
    
        PhishingSiteRequest of = PhishingSiteRequest.of("https://xn--cm-68s.cc/", 10);
        System.out.println(GoPlusClient.phishingSite(of));
        
    }

```

#### rugpullDetecting

```java
    public void rugpullDetecting() throws ApiException {
    
        DefiInfoRequest of = DefiInfoRequest.of(
                "1", 
                "0x11450058d796b02eb53e65374be59cff65d3fe7f",
                null,
                1000
        );
        System.out.println(GoPlusClient.rugpullDetecting(of));
        
    }


```

### License

---
This repository is available under the [GoPlus Open Source License](LICENSE)


