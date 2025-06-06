package io.gopluslabs.client.request;

public class SolanaPreExecutionRequest extends BaseRequest {

    private String encodedTransaction;

    public static SolanaPreExecutionRequest of(String encodedTransaction) {
        SolanaPreExecutionRequest request = new SolanaPreExecutionRequest();
        request.encodedTransaction = encodedTransaction;
        return request;
    }

    public static SolanaPreExecutionRequest of(String encodedTransaction, String authorization) {
        SolanaPreExecutionRequest request = new SolanaPreExecutionRequest();
        request.encodedTransaction = encodedTransaction;
        request.authorization = authorization;
        return request;
    }

    public static SolanaPreExecutionRequest of(String encodedTransaction, Integer timeout) {
        SolanaPreExecutionRequest request = new SolanaPreExecutionRequest();
        request.encodedTransaction = encodedTransaction;
        request.timeout = timeout;
        return request;
    }

    public static SolanaPreExecutionRequest of(String encodedTransaction, String authorization, Integer timeout) {
        SolanaPreExecutionRequest request = new SolanaPreExecutionRequest();
        request.encodedTransaction = encodedTransaction;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    public String getEncodedTransaction() {
        return encodedTransaction;
    }
}
