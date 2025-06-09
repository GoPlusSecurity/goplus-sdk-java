package io.gopluslabs.client.request;

public class LocksInfoLpv3Request extends BaseRequest {

    private String chainId;
    private Integer pageNum;
    private Integer pageSize;
    private String poolAddress;

    public static LocksInfoLpv3Request of(String chainId, Integer pageNum, Integer pageSize, String poolAddress) {
        LocksInfoLpv3Request request = new LocksInfoLpv3Request();
        request.chainId = chainId;
        request.pageNum = pageNum;
        request.pageSize = pageSize;
        request.poolAddress = poolAddress;
        return request;
    }

    public static LocksInfoLpv3Request of(String chainId, Integer pageNum, Integer pageSize, String poolAddress, String authorization) {
        LocksInfoLpv3Request request = new LocksInfoLpv3Request();
        request.chainId = chainId;
        request.pageNum = pageNum;
        request.pageSize = pageSize;
        request.poolAddress = poolAddress;
        request.authorization = authorization;
        return request;
    }

    public static LocksInfoLpv3Request of(String chainId, Integer pageNum, Integer pageSize, String poolAddress, Integer timeout) {
        LocksInfoLpv3Request request = new LocksInfoLpv3Request();
        request.chainId = chainId;
        request.pageNum = pageNum;
        request.pageSize = pageSize;
        request.poolAddress = poolAddress;
        request.timeout = timeout;
        return request;
    }

    public static LocksInfoLpv3Request of(String chainId, Integer pageNum, Integer pageSize, String poolAddress, String authorization, Integer timeout) {
        LocksInfoLpv3Request request = new LocksInfoLpv3Request();
        request.chainId = chainId;
        request.pageNum = pageNum;
        request.pageSize = pageSize;
        request.poolAddress = poolAddress;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    public String getChainId() {
        return chainId;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public String getPoolAddress() {
        return poolAddress;
    }
}
