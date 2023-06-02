package io.gopluslabs.client.request;

public class TokenSecurityRequest extends BaseRequest {


    private String chainId;
    private String address;

    public static TokenSecurityRequest of(String chainId, String address) {
        TokenSecurityRequest request = new TokenSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        return request;
    }
    public static TokenSecurityRequest of(String chainId, String address, String authorization) {
        TokenSecurityRequest request = new TokenSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.authorization = authorization;
        return request;
    }

    public static TokenSecurityRequest of(String chainId, String address, Integer timeout) {
        TokenSecurityRequest request = new TokenSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.timeout = timeout;
        return request;
    }

    public static TokenSecurityRequest of(String chainId, String address, String authorization, Integer timeout) {
        TokenSecurityRequest request = new TokenSecurityRequest();
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
