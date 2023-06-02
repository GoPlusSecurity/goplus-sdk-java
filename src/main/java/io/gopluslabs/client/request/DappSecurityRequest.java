package io.gopluslabs.client.request;

public class DappSecurityRequest extends BaseRequest{
    private String url;

    public static DappSecurityRequest of(String url){
        DappSecurityRequest request = new DappSecurityRequest();
        request.url = url;
        return request;
    }

    public static DappSecurityRequest of(String url, String authorization){
        DappSecurityRequest request = new DappSecurityRequest();
        request.url = url;
        request.authorization = authorization;
        return request;
    }

    public static DappSecurityRequest of(String url, Integer timeout){
        DappSecurityRequest request = new DappSecurityRequest();
        request.url = url;
        request.timeout = timeout;
        return request;
    }

    public static DappSecurityRequest of(String url, String authorization, Integer timeout){
        DappSecurityRequest request = new DappSecurityRequest();
        request.url = url;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    public String getUrl() {
        return url;
    }
}
