package io.gopluslabs.client.request;

import io.gopluslabs.client.model.ParseAbiDataRequest;

public class InputDecodeRequest extends BaseRequest {


    private String chainId;
    private String address;
    private String data;
    private String signer;

    private ParseAbiDataRequest body;

    public static InputDecodeRequest of(String chainId, String address, String data) {
        InputDecodeRequest request = new InputDecodeRequest();
        ParseAbiDataRequest abiDataRequest = new ParseAbiDataRequest();
        abiDataRequest.setData(data);
        abiDataRequest.setChainId(chainId);
        abiDataRequest.setContractAddress(address);
        request.body = abiDataRequest;
        return request;
    }

    public static InputDecodeRequest of(String chainId, String address, String data, String signer) {
        InputDecodeRequest request = new InputDecodeRequest();
        ParseAbiDataRequest abiDataRequest = new ParseAbiDataRequest();
        abiDataRequest.setData(data);
        abiDataRequest.setChainId(chainId);
        abiDataRequest.setContractAddress(address);
        abiDataRequest.setSigner(signer);
        request.body = abiDataRequest;
        return request;
    }

    public static InputDecodeRequest of(String chainId, String address, String data, String signer, String authorization) {
        InputDecodeRequest request = new InputDecodeRequest();
        ParseAbiDataRequest abiDataRequest = new ParseAbiDataRequest();
        abiDataRequest.setData(data);
        abiDataRequest.setChainId(chainId);
        abiDataRequest.setContractAddress(address);
        abiDataRequest.setSigner(signer);
        request.body = abiDataRequest;
        request.authorization = authorization;
        return request;
    }

    public static InputDecodeRequest of(String chainId, String address, String data,  Integer timeout) {
        InputDecodeRequest request = new InputDecodeRequest();
        ParseAbiDataRequest abiDataRequest = new ParseAbiDataRequest();
        abiDataRequest.setData(data);
        abiDataRequest.setChainId(chainId);
        abiDataRequest.setContractAddress(address);
        request.body = abiDataRequest;
        request.timeout = timeout;
        return request;
    }

    public static InputDecodeRequest of(String chainId, String address, String data, String signer,  Integer timeout) {
        InputDecodeRequest request = new InputDecodeRequest();
        ParseAbiDataRequest abiDataRequest = new ParseAbiDataRequest();
        abiDataRequest.setData(data);
        abiDataRequest.setChainId(chainId);
        abiDataRequest.setContractAddress(address);
        abiDataRequest.setSigner(signer);
        request.body = abiDataRequest;
        request.timeout = timeout;
        return request;
    }

    public static InputDecodeRequest of(String chainId, String address, String data, String signer, String authorization, Integer timeout) {
        InputDecodeRequest request = new InputDecodeRequest();
        ParseAbiDataRequest abiDataRequest = new ParseAbiDataRequest();
        abiDataRequest.setData(data);
        abiDataRequest.setChainId(chainId);
        abiDataRequest.setContractAddress(address);
        abiDataRequest.setSigner(signer);
        request.body = abiDataRequest;
        request.authorization = authorization;
        request.timeout = timeout;
        return request;
    }

    public String getChainId() {
        return chainId;
    }

    public String getAddress() {
        return address;
    }

    public ParseAbiDataRequest getBody() {
        return body;
    }

    public String getData() {
        return data;
    }

    public String getSigner() {
        return signer;
    }
}
