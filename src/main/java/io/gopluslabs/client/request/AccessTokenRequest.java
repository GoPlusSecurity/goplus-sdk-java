package io.gopluslabs.client.request;

import io.gopluslabs.client.model.GetAccessTokenRequest;

public class AccessTokenRequest extends BaseRequest{

    private GetAccessTokenRequest request;


    public static AccessTokenRequest of(String appKey, String sign, Long time){
        AccessTokenRequest accessTokenRequest = new AccessTokenRequest();
        GetAccessTokenRequest getAccessTokenRequest = new GetAccessTokenRequest();
        getAccessTokenRequest.setAppKey(appKey);
        getAccessTokenRequest.setSign(sign);
        getAccessTokenRequest.setTime(time);
        accessTokenRequest.request = getAccessTokenRequest;
        return accessTokenRequest;
    }


    public static AccessTokenRequest of(String appKey, String sign, Long time, Integer timeOut){
        AccessTokenRequest accessTokenRequest = new AccessTokenRequest();
        GetAccessTokenRequest getAccessTokenRequest = new GetAccessTokenRequest();
        getAccessTokenRequest.setAppKey(appKey);
        getAccessTokenRequest.setSign(sign);
        getAccessTokenRequest.setTime(time);
        accessTokenRequest.request = getAccessTokenRequest;
        accessTokenRequest.timeout = timeOut;
        return accessTokenRequest;
    }

    public GetAccessTokenRequest getRequest() {
        return request;
    }
}
