package io.gopluslabs.client.request;

public class DefiInfoRequest extends BaseRequest {

    private String chainId;
    private String address;

    public static DefiInfoRequest of(String chainId, String address) {
        DefiInfoRequest request = new DefiInfoRequest();
        request.chainId = chainId;
        request.address = address;
        return request;
    }
    public static DefiInfoRequest of(String chainId, String address, String authorization) {
        DefiInfoRequest request = new DefiInfoRequest();
        request.chainId = chainId;
        request.address = address;
        request.authorization = authorization;
        return request;
    }

    public static DefiInfoRequest of(String chainId, String address, Integer timeout) {
        DefiInfoRequest request = new DefiInfoRequest();
        request.chainId = chainId;
        request.address = address;
        request.timeout = timeout;
        return request;
    }

    public static DefiInfoRequest of(String chainId, String address, String authorization, Integer timeout) {
        DefiInfoRequest request = new DefiInfoRequest();
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

