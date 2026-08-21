package io.gopluslabs.client.request;

public class AddressScanResultRequest extends BaseRequest {

    private String requestId;

    public static AddressScanResultRequest of(String requestId) {
        AddressScanResultRequest request = new AddressScanResultRequest();
        request.requestId = requestId;
        return request;
    }

    public static AddressScanResultRequest of(String requestId, String authorization) {
        AddressScanResultRequest request = new AddressScanResultRequest();
        request.requestId = requestId;
        request.authorization = authorization;
        return request;
    }

    public static AddressScanResultRequest of(String requestId, Integer timeout) {
        AddressScanResultRequest request = new AddressScanResultRequest();
        request.requestId = requestId;
        request.timeout = timeout;
        return request;
    }

    public static AddressScanResultRequest of(String requestId, String authorization, Integer timeout) {
        AddressScanResultRequest request = new AddressScanResultRequest();
        request.requestId = requestId;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    public String getRequestId() {
        return requestId;
    }
}
