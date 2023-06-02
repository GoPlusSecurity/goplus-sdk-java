package io.gopluslabs.client.request;

public class Erc721ApprovalSecurityRequest extends BaseRequest {


    private String chainId;
    private String address;

    public static Erc721ApprovalSecurityRequest of(String chainId, String address) {
        Erc721ApprovalSecurityRequest request = new Erc721ApprovalSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        return request;
    }
    public static Erc721ApprovalSecurityRequest of(String chainId, String address, String authorization) {
        Erc721ApprovalSecurityRequest request = new Erc721ApprovalSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.authorization = authorization;
        return request;
    }

    public static Erc721ApprovalSecurityRequest of(String chainId, String address, Integer timeout) {
        Erc721ApprovalSecurityRequest request = new Erc721ApprovalSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.timeout = timeout;
        return request;
    }

    public static Erc721ApprovalSecurityRequest of(String chainId, String address, String authorization, Integer timeout) {
        Erc721ApprovalSecurityRequest request = new Erc721ApprovalSecurityRequest();
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
