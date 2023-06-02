package io.gopluslabs.client.request;


public class AddressSecurityRequest extends BaseRequest {


    private String chainId;
    private String address;

    public static AddressSecurityRequest of(String chainId, String address) {
        AddressSecurityRequest request = new AddressSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        return request;
    }
    public static AddressSecurityRequest of(String chainId, String address, String authorization) {
        AddressSecurityRequest request = new AddressSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.authorization = authorization;
        return request;
    }

    public static AddressSecurityRequest of(String chainId, String address, Integer timeout) {
        AddressSecurityRequest request = new AddressSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.timeout = timeout;
        return request;
    }

    public static AddressSecurityRequest of(String chainId, String address, String authorization, Integer timeout) {
        AddressSecurityRequest request = new AddressSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    public String getChainId() {
        return chainId;
    }

    public String getAddress() {
        return address;
    }
}

