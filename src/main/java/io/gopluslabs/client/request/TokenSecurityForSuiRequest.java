package io.gopluslabs.client.request;

public class TokenSecurityForSuiRequest extends BaseRequest {

    private String contractAddresses;


    public static TokenSecurityForSuiRequest of(String contractAddresses) {
        TokenSecurityForSuiRequest request = new TokenSecurityForSuiRequest();
        request.contractAddresses = contractAddresses;
        return request;
    }

    public static TokenSecurityForSuiRequest of(String contractAddresses, String authorization) {
        TokenSecurityForSuiRequest request = new TokenSecurityForSuiRequest();
        request.contractAddresses = contractAddresses;
        request.authorization = authorization;
        return request;
    }

    public static TokenSecurityForSuiRequest of(String contractAddresses, Integer timeout) {
        TokenSecurityForSuiRequest request = new TokenSecurityForSuiRequest();
        request.contractAddresses = contractAddresses;
        request.timeout = timeout;
        return request;
    }

    public static TokenSecurityForSuiRequest of(String contractAddresses, String authorization, Integer timeout) {
        TokenSecurityForSuiRequest request = new TokenSecurityForSuiRequest();
        request.contractAddresses = contractAddresses;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    public String getContractAddresses() {
        return contractAddresses;
    }
}
