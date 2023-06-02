package io.gopluslabs.client.request;

public class NftSecurityRequest extends BaseRequest {


    private String chainId;
    private String address;
    private String tokenId;

    public static NftSecurityRequest of(String chainId, String address, String tokenId) {
        NftSecurityRequest request = new NftSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.tokenId = tokenId;
        return request;
    }
    public static NftSecurityRequest of(String chainId, String address, String tokenId, String authorization) {
        NftSecurityRequest request = new NftSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.tokenId = tokenId;
        request.authorization = authorization;
        return request;
    }

    public static NftSecurityRequest of(String chainId, String address, String tokenId, Integer timeout) {
        NftSecurityRequest request = new NftSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.tokenId = tokenId;
        request.timeout = timeout;
        return request;
    }

    public static NftSecurityRequest of(String chainId, String address, String tokenId, String authorization, Integer timeout) {
        NftSecurityRequest request = new NftSecurityRequest();
        request.chainId = chainId;
        request.address = address;
        request.tokenId = tokenId;
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

    public String getTokenId() {
        return tokenId;
    }
}
