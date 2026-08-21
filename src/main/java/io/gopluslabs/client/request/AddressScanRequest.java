package io.gopluslabs.client.request;

public class AddressScanRequest extends BaseRequest {

    private String address;
    private String chainId;

    public static AddressScanRequest of(String address, String chainId) {
        AddressScanRequest request = new AddressScanRequest();
        request.address = address;
        request.chainId = chainId;
        return request;
    }

    public static AddressScanRequest of(String address, String chainId, String authorization) {
        AddressScanRequest request = new AddressScanRequest();
        request.address = address;
        request.chainId = chainId;
        request.authorization = authorization;
        return request;
    }

    public static AddressScanRequest of(String address, String chainId, Integer timeout) {
        AddressScanRequest request = new AddressScanRequest();
        request.address = address;
        request.chainId = chainId;
        request.timeout = timeout;
        return request;
    }

    public static AddressScanRequest of(String address, String chainId, String authorization, Integer timeout) {
        AddressScanRequest request = new AddressScanRequest();
        request.address = address;
        request.chainId = chainId;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    public String getAddress() {
        return address;
    }

    public String getChainId() {
        return chainId;
    }
}
