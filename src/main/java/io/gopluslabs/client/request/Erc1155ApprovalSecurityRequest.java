package io.gopluslabs.client.request;

public class Erc1155ApprovalSecurityRequest extends BaseRequest {


    private String chainId;
    private String address;

    public static Erc1155ApprovalSecurityRequest of(String chainId, String address) {
        Erc1155ApprovalSecurityRequest request = new Erc1155ApprovalSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        return request;
    }
    public static Erc1155ApprovalSecurityRequest of(String chainId, String address, String authorization) {
        Erc1155ApprovalSecurityRequest request = new Erc1155ApprovalSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.authorization = authorization;
        return request;
    }

    public static Erc1155ApprovalSecurityRequest of(String chainId, String address, Integer timeout) {
        Erc1155ApprovalSecurityRequest request = new Erc1155ApprovalSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.timeout = timeout;
        return request;
    }

    public static Erc1155ApprovalSecurityRequest of(String chainId, String address, String authorization, Integer timeout) {
        Erc1155ApprovalSecurityRequest request = new Erc1155ApprovalSecurityRequest();
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
