package io.gopluslabs.client.request;

import io.gopluslabs.client.model.TransactionSecurityRequest;

/**
 * Request of {@code POST /api/v1/transaction_simulation}.
 *
 * <p><b>Note:</b> this API expects a hexadecimal chain id (e.g. {@code "0x1"} for Ethereum mainnet,
 * {@code "0x38"} for BSC), unlike the other GoPlus APIs, which take the decimal form
 * ({@code "1"}, {@code "56"}).
 */
public class TransactionSimulationRequest extends BaseRequest {

    private TransactionSecurityRequest body;

    /**
     * @param chainId hexadecimal chain id, e.g. {@code "0x1"}
     * @param from    sender address
     * @param to      recipient / contract address
     * @param data    call data, {@code "0x"} for a plain transfer
     * @param value   native token amount
     * @return TransactionSimulationRequest
     */
    public static TransactionSimulationRequest of(String chainId, String from, String to, String data, String value) {
        TransactionSimulationRequest request = new TransactionSimulationRequest();
        request.body = buildBody(chainId, from, to, data, value);
        return request;
    }

    /**
     * @param chainId hexadecimal chain id, e.g. {@code "0x1"}
     * @param from    sender address
     * @param to      recipient / contract address
     * @param data    call data, {@code "0x"} for a plain transfer
     * @param value   native token amount
     * @param authorization access token
     * @return TransactionSimulationRequest
     */
    public static TransactionSimulationRequest of(String chainId, String from, String to, String data, String value, String authorization) {
        TransactionSimulationRequest request = new TransactionSimulationRequest();
        request.body = buildBody(chainId, from, to, data, value);
        request.authorization = authorization;
        return request;
    }

    /**
     * @param chainId hexadecimal chain id, e.g. {@code "0x1"}
     * @param from    sender address
     * @param to      recipient / contract address
     * @param data    call data, {@code "0x"} for a plain transfer
     * @param value   native token amount
     * @param timeout timeout (MILLISECONDS)
     * @return TransactionSimulationRequest
     */
    public static TransactionSimulationRequest of(String chainId, String from, String to, String data, String value, Integer timeout) {
        TransactionSimulationRequest request = new TransactionSimulationRequest();
        request.body = buildBody(chainId, from, to, data, value);
        request.timeout = timeout;
        return request;
    }

    /**
     * @param chainId hexadecimal chain id, e.g. {@code "0x1"}
     * @param from    sender address
     * @param to      recipient / contract address
     * @param data    call data, {@code "0x"} for a plain transfer
     * @param value   native token amount
     * @param authorization access token
     * @param timeout timeout (MILLISECONDS)
     * @return TransactionSimulationRequest
     */
    public static TransactionSimulationRequest of(String chainId, String from, String to, String data, String value, String authorization, Integer timeout) {
        TransactionSimulationRequest request = new TransactionSimulationRequest();
        request.body = buildBody(chainId, from, to, data, value);
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    /**
     * Use this overload when the simulation needs the optional fields
     * (gasLimit, gasPrice, maxFeePerGas, maxPriorityFeePerGas, nonce, accessList, url).
     * Remember that {@code body.chainId} must be hexadecimal, e.g. {@code "0x1"}.
     *
     * @param body TransactionSecurityRequest
     * @return TransactionSimulationRequest
     */
    public static TransactionSimulationRequest of(TransactionSecurityRequest body) {
        TransactionSimulationRequest request = new TransactionSimulationRequest();
        request.body = body;
        return request;
    }

    public static TransactionSimulationRequest of(TransactionSecurityRequest body, String authorization) {
        TransactionSimulationRequest request = new TransactionSimulationRequest();
        request.body = body;
        request.authorization = authorization;
        return request;
    }

    public static TransactionSimulationRequest of(TransactionSecurityRequest body, Integer timeout) {
        TransactionSimulationRequest request = new TransactionSimulationRequest();
        request.body = body;
        request.timeout = timeout;
        return request;
    }

    public static TransactionSimulationRequest of(TransactionSecurityRequest body, String authorization, Integer timeout) {
        TransactionSimulationRequest request = new TransactionSimulationRequest();
        request.body = body;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    private static TransactionSecurityRequest buildBody(String chainId, String from, String to, String data, String value) {
        return new TransactionSecurityRequest()
                .chainId(chainId)
                .from(from)
                .to(to)
                .data(data)
                .value(value);
    }

    public TransactionSecurityRequest getBody() {
        return body;
    }
}
