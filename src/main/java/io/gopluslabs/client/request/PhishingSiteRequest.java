package io.gopluslabs.client.request;

public class PhishingSiteRequest extends BaseRequest{
    private String url;

    public static PhishingSiteRequest of(String url){
        PhishingSiteRequest request = new PhishingSiteRequest();
        request.url = url;
        return request;
    }

    public static PhishingSiteRequest of(String url, String authorization){
        PhishingSiteRequest request = new PhishingSiteRequest();
        request.url = url;
        request.authorization = authorization;
        return request;
    }

    public static PhishingSiteRequest of(String url, Integer timeout){
        PhishingSiteRequest request = new PhishingSiteRequest();
        request.url = url;
        request.timeout = timeout;
        return request;
    }

    public static PhishingSiteRequest of(String url, String authorization, Integer timeout){
        PhishingSiteRequest request = new PhishingSiteRequest();
        request.url = url;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    public String getUrl() {
        return url;
    }
}
