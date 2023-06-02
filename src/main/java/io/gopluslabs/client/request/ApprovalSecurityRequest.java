package io.gopluslabs.client.request;


public class ApprovalSecurityRequest extends BaseRequest {


    private String chainId;
    private String address;

    public static ApprovalSecurityRequest of(String chainId, String address) {
        ApprovalSecurityRequest request = new ApprovalSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        return request;
    }
    public static ApprovalSecurityRequest of(String chainId, String address, String authorization) {
        ApprovalSecurityRequest request = new ApprovalSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.authorization = authorization;
        return request;
    }

    public static ApprovalSecurityRequest of(String chainId, String address, Integer timeout) {
        ApprovalSecurityRequest request = new ApprovalSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.timeout = timeout;
        return request;
    }

    public static ApprovalSecurityRequest of(String chainId, String address, String authorization, Integer timeout) {
        ApprovalSecurityRequest request = new ApprovalSecurityRequest();
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
