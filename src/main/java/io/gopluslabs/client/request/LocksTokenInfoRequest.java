package io.gopluslabs.client.request;

public class LocksTokenInfoRequest extends BaseRequest {

    private String chainId;
    private Integer pageNum;
    private Integer pageSize;
    private String tokenAddress;

    public static LocksTokenInfoRequest of(String chainId, Integer pageNum, Integer pageSize, String tokenAddress) {
        LocksTokenInfoRequest request = new LocksTokenInfoRequest();
        request.chainId = chainId;
        request.pageNum = pageNum;
        request.pageSize = pageSize;
        request.tokenAddress = tokenAddress;
        return request;
    }

    public static LocksTokenInfoRequest of(String chainId, Integer pageNum, Integer pageSize, String tokenAddress, String authorization) {
        LocksTokenInfoRequest request = new LocksTokenInfoRequest();
        request.chainId = chainId;
        request.pageNum = pageNum;
        request.pageSize = pageSize;
        request.tokenAddress = tokenAddress;
        request.authorization = authorization;
        return request;
    }

    public static LocksTokenInfoRequest of(String chainId, Integer pageNum, Integer pageSize, String tokenAddress, Integer timeout) {
        LocksTokenInfoRequest request = new LocksTokenInfoRequest();
        request.chainId = chainId;
        request.pageNum = pageNum;
        request.pageSize = pageSize;
        request.tokenAddress = tokenAddress;
        request.timeout = timeout;
        return request;
    }

    public static LocksTokenInfoRequest of(String chainId, Integer pageNum, Integer pageSize, String tokenAddress, String authorization, Integer timeout) {
        LocksTokenInfoRequest request = new LocksTokenInfoRequest();
        request.chainId = chainId;
        request.pageNum = pageNum;
        request.pageSize = pageSize;
        request.tokenAddress = tokenAddress;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    public String getChainId() {
        return chainId;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public String getTokenAddress() {
        return tokenAddress;
    }
}
