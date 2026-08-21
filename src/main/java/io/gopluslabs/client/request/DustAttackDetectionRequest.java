package io.gopluslabs.client.request;

import io.gopluslabs.client.model.DustAttackDetectionReq;

public class DustAttackDetectionRequest extends BaseRequest {

    private String from;
    private String to;

    private DustAttackDetectionReq body;

    public static DustAttackDetectionRequest of(String from, String to) {
        DustAttackDetectionRequest request = new DustAttackDetectionRequest();
        request.from = from;
        request.to = to;
        request.body = buildBody(from, to);
        return request;
    }

    public static DustAttackDetectionRequest of(String from, String to, String authorization) {
        DustAttackDetectionRequest request = new DustAttackDetectionRequest();
        request.from = from;
        request.to = to;
        request.body = buildBody(from, to);
        request.authorization = authorization;
        return request;
    }

    public static DustAttackDetectionRequest of(String from, String to, Integer timeout) {
        DustAttackDetectionRequest request = new DustAttackDetectionRequest();
        request.from = from;
        request.to = to;
        request.body = buildBody(from, to);
        request.timeout = timeout;
        return request;
    }

    public static DustAttackDetectionRequest of(String from, String to, String authorization, Integer timeout) {
        DustAttackDetectionRequest request = new DustAttackDetectionRequest();
        request.from = from;
        request.to = to;
        request.body = buildBody(from, to);
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    private static DustAttackDetectionReq buildBody(String from, String to) {
        DustAttackDetectionReq req = new DustAttackDetectionReq();
        req.setFrom(from);
        req.setTo(to);
        return req;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public DustAttackDetectionReq getBody() {
        return body;
    }
}
