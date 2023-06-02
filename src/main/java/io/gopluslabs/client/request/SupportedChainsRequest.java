package io.gopluslabs.client.request;

public class SupportedChainsRequest extends BaseRequest {


    private String name;

    public static SupportedChainsRequest of(String name) {
        SupportedChainsRequest request = new SupportedChainsRequest();
        request.name = name;
        return request;
    }
    public static SupportedChainsRequest of(String name, String authorization) {
        SupportedChainsRequest request = new SupportedChainsRequest();
        request.name = name;
        request.authorization = authorization;
        return request;
    }

    public static SupportedChainsRequest of(String name, Integer timeout) {
        SupportedChainsRequest request = new SupportedChainsRequest();
        request.name = name;
        request.timeout = timeout;
        return request;
    }

    public static SupportedChainsRequest of(String name, String authorization, Integer timeout) {
        SupportedChainsRequest request = new SupportedChainsRequest();
        request.name = name;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    public String getName() {
        return name;
    }


}
