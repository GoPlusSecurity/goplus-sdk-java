package io.gopluslabs.client.request;

public class TokenSecurityForSolanaRequest extends BaseRequest {

    private String contractAddresses;

    public static TokenSecurityForSolanaRequest of(String contractAddresses) {
        TokenSecurityForSolanaRequest request = new TokenSecurityForSolanaRequest();
        request.contractAddresses = contractAddresses;
        return request;
    }

    public static TokenSecurityForSolanaRequest of(String contractAddresses, String authorization) {
        TokenSecurityForSolanaRequest request = new TokenSecurityForSolanaRequest();
        request.contractAddresses = contractAddresses;
        request.authorization = authorization;
        return request;
    }

    public static TokenSecurityForSolanaRequest of(String contractAddresses, Integer timeout) {
        TokenSecurityForSolanaRequest request = new TokenSecurityForSolanaRequest();
        request.contractAddresses = contractAddresses;
        request.timeout = timeout;
        return request;
    }

    public static TokenSecurityForSolanaRequest of(String contractAddresses, String authorization, Integer timeout) {
        TokenSecurityForSolanaRequest request = new TokenSecurityForSolanaRequest();
        request.contractAddresses = contractAddresses;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    public String getContractAddresses() {
        return contractAddresses;
    }
}
