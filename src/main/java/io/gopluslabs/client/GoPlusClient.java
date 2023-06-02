package io.gopluslabs.client;

import io.gopluslabs.client.api.*;
import io.gopluslabs.client.model.*;
import io.gopluslabs.client.request.*;

import java.util.Optional;

public class GoPlusClient {


    /**
     * get token
     *
     * @param request request
     * @return ResponseWrapperGetAccessTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperGetAccessTokenResponse getAccessToken(AccessTokenRequest request) throws ApiException {

        TokenControllerApi api = Optional.ofNullable(request.getTimeout())
                .map(timeout -> new TokenControllerApi(createApiClient(timeout)))
                .orElse(new TokenControllerApi());

        GetAccessTokenRequest getAccessTokenRequest = new GetAccessTokenRequest();
        getAccessTokenRequest.setAppKey(request.getRequest().getAppKey());
        getAccessTokenRequest.setSign(request.getRequest().getSign());
        getAccessTokenRequest.setTime(request.getRequest().getTime());

        return api.getAccessTokenUsingPOST(getAccessTokenRequest);
    }


    /**
     * Get the list of chains supported by different functions.
     *
     * @param request SupportedChainsRequest
     * @return ResponseWrapperListJSONObject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperListGetChainsList supportedChains(SupportedChainsRequest request) throws ApiException {

        TokenControllerV1Api api = new TokenControllerV1Api();
        if (request.getTimeout() != null) {
            api.setApiClient(createApiClient(request.getTimeout()));
        }

        return api.getChainsListUsingGET(request.getAuthorization(), request.getName());
    }

    /**
     * Get token security and risk data.
     *
     * @param request TokenSecurityRequest
     * @return ResponseWrapperTokenSecurity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperTokenSecurity tokenSecurity(TokenSecurityRequest request) throws ApiException {

        TokenControllerV1Api api = new TokenControllerV1Api();
        if (request.getTimeout()!=null){
            api.setApiClient(createApiClient(request.getTimeout()));
        }

        return api.tokenSecurityUsingGET1(request.getChainId(), request.getAddress(), request.getAuthorization());
    }


    /**
     * Check if the address is malicious
     *
     * @param request AddressSecurityRequest
     * @return ResponseWrapperAddressContract
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperAddressContract addressSecurity(AddressSecurityRequest request) throws ApiException {

        ApproveControllerV1Api api = new ApproveControllerV1Api();
        if (request.getTimeout()!=null){
            api.setApiClient(createApiClient(request.getTimeout()));
        }

        return api.addressContractUsingGET1(request.getAddress(), request.getAuthorization(), request.getChainId());

    }

    /**
     * Check if the approval is secure
     *
     * @param request ApprovalSecurityRequest
     * @return ResponseWrapperContractApproveResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperContractApproveResponse approvalSecurity(ApprovalSecurityRequest request) throws ApiException {
        ApproveControllerV1Api api = new ApproveControllerV1Api();
        if (request.getTimeout()!=null){
            api.setApiClient(createApiClient(request.getTimeout()));
        }
        return api.approvalContractUsingGET(request.getChainId(), request.getAddress(), request.getAuthorization());
    }


    /**
     * Check risk of all erc20 approvals under one EOA.
     *
     * @param request Erc20ApprovalSecurityRequest
     * @return ResponseWrapperListApproveTokenOutListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperListApproveTokenOutListResponse erc20ApprovalSecurity(Erc20ApprovalSecurityRequest request) throws ApiException {

        ApproveControllerV2Api api = new ApproveControllerV2Api();
        if (request.getTimeout()!=null){
            api.setApiClient(createApiClient(request.getTimeout()));
        }

        return new ApproveControllerV2Api().addressTokenApproveListUsingGET1(
                request.getAddress(),
                request.getChainId(),
                request.getAuthorization()
        );
    }

    /**
     * Check risk of all erc721 approvals under one EOA.
     *
     * @param request Erc721ApprovalSecurityRequest
     * @return ResponseWrapperListApproveNFTListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperListApproveNFTListResponse erc721ApprovalSecurity(Erc721ApprovalSecurityRequest request) throws ApiException {
        ApproveControllerV2Api api = new ApproveControllerV2Api();
        if (request.getTimeout()!=null){
            api.setApiClient(createApiClient(request.getTimeout()));
        }
        return new ApproveControllerV2Api().addressNFT721ApproveListUsingGET1(
                request.getAddress(),
                request.getChainId(),
                request.getAuthorization()
        );
    }


    /**
     * Check risk of all erc1155 approvals under one EOA.
     *
     * @param request Erc1155ApprovalSecurityRequest
     * @return ResponseWrapperListApproveNFT1155ListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperListApproveNFT1155ListResponse erc1155ApprovalSecurity(Erc1155ApprovalSecurityRequest request) throws ApiException {
        ApproveControllerV2Api api = new ApproveControllerV2Api();
        if (request.getTimeout()!=null){
            api.setApiClient(createApiClient(request.getTimeout()));
        }
        return api.addressNFT1155ApproveListUsingGET1(
                request.getAddress(),
                request.getChainId(),
                request.getAuthorization()
        );
    }


    /**
     * Get abi decode info
     *
     * @param request InputDecodeRequest
     * @return ResponseWrapperParseAbiDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperParseAbiDataResponse inputDecode(InputDecodeRequest request) throws ApiException {
        ContractAbiControllerApi api = new ContractAbiControllerApi();
        if (request.getTimeout()!=null){
            api.setApiClient(createApiClient(request.getTimeout()));
        }


        ParseAbiDataRequest parseAbiDataRequest = new ParseAbiDataRequest();
        parseAbiDataRequest.setData(request.getBody().getData());
        parseAbiDataRequest.setChainId(request.getBody().getChainId());
        parseAbiDataRequest.setContractAddress(request.getBody().getContractAddress());
        parseAbiDataRequest.setSigner(request.getBody().getSigner());

        return api.getAbiDataInfoUsingPOST(parseAbiDataRequest, request.getAuthorization());
    }


    /**
     * Get NFT security and risk data.
     *
     * @param request NftSecurityRequest
     * @return ResponseWrapperGetNftInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperGetNftInfo nftSecurity(NftSecurityRequest request) throws ApiException {
        NftControllerApi api = new NftControllerApi();

        if (request.getTimeout()!=null){
            api.setApiClient(createApiClient(request.getTimeout()));
        }

        return api.getNftInfoUsingGET1(request.getChainId(), request.getAddress(), request.getAuthorization(), request.getTokenId());
    }


    /**
     * Check risk of dapp through URL
     *
     * @param request DappSecurityRequest
     * @return ResponseWrapperDappContractSecurityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperDappContractSecurityResponse dappSecurity(DappSecurityRequest request) throws ApiException {
        DappControllerApi api = new DappControllerApi();
        if (request.getTimeout()!=null){
            api.setApiClient(createApiClient(request.getTimeout()));
        }

        return api.getDappInfoUsingGET(
                request.getAuthorization(),
                request.getUrl()
        );
    }


    /**
     * Check if the  url is a phishing site
     *
     * @param request PhishingSiteRequest
     * @return ResponseWrapperPhishingSite
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperPhishingSite phishingSite(PhishingSiteRequest request) throws ApiException {
        WebsiteControllerApi api = new WebsiteControllerApi();
        if (request.getTimeout()!=null){
            api.setApiClient(createApiClient(request.getTimeout()));
        }
        return api.phishingSiteUsingGET(request.getUrl(), request.getAuthorization());
    }

    /**
     * Rug-pull Detection API Beta
     *
     * @param request DefiInfoRequest
     * @return ResponseWrapperGetDefiInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ResponseWrapperGetDefiInfo rugpullDetecting(DefiInfoRequest request) throws ApiException {
        DefiControllerApi api = new DefiControllerApi();
        if (request.getTimeout()!=null){
            api.setApiClient(createApiClient(request.getTimeout()));
        }
        return api.getDefiInfoUsingGET(request.getAddress(), request.getChainId(), request.getAuthorization());
    }




    private static ApiClient createApiClient(Integer timeOut) {
        ApiClient apiClient = new ApiClient();
        apiClient.setReadTimeout(timeOut);
        return apiClient;
    }


}
