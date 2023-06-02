package io.gopluslabs.client.request;

public class Erc20ApprovalSecurityRequest extends BaseRequest {


    private String chainId;
    private String address;

    public static Erc20ApprovalSecurityRequest of(String chainId, String address) {
        Erc20ApprovalSecurityRequest request = new Erc20ApprovalSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        return request;
    }
    public static Erc20ApprovalSecurityRequest of(String chainId, String address, String authorization) {
        Erc20ApprovalSecurityRequest request = new Erc20ApprovalSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.authorization = authorization;
        return request;
    }

    public static Erc20ApprovalSecurityRequest of(String chainId, String address, Integer timeout) {
        Erc20ApprovalSecurityRequest request = new Erc20ApprovalSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.timeout = timeout;
        return request;
    }

    public static Erc20ApprovalSecurityRequest of(String chainId, String address, String authorization, Integer timeout) {
        Erc20ApprovalSecurityRequest request = new Erc20ApprovalSecurityRequest();
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
