package io.gopluslabs.client;

import io.gopluslabs.client.api.*;
import io.gopluslabs.client.model.*;
import io.gopluslabs.client.request.*;
import io.gopluslabs.client.response.*;
import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

public class GoPlusClient {


    /**
     * get token
     *
     * @param request request
     * @return AccessToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static AccessToken getAccessToken(AccessTokenRequest request) throws ApiException {

        TokenControllerApi api = new TokenControllerApi();
        api.setApiClient(createApiClient(request.getTimeout()));

        GetAccessTokenRequest getAccessTokenRequest = new GetAccessTokenRequest();
        getAccessTokenRequest.setAppKey(request.getRequest().getAppKey());
        getAccessTokenRequest.setSign(request.getRequest().getSign());
        getAccessTokenRequest.setTime(request.getRequest().getTime());
        ResponseWrapperGetAccessTokenResponse accessTokenUsingPOST = api.getAccessTokenUsingPOST(getAccessTokenRequest);
        return AccessToken.of(accessTokenUsingPOST);
    }


    /**
     * Get the list of chains supported by different functions.
     *
     * @param request SupportedChainsRequest
     * @return ChainsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ChainsList supportedChains(SupportedChainsRequest request) throws ApiException {

        TokenControllerV1Api api = new TokenControllerV1Api();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperListGetChainsList chainsListUsingGET = api.getChainsListUsingGET(request.getAuthorization(), request.getName());
        return ChainsList.of(chainsListUsingGET);
    }

    /**
     * Get token security and risk data.
     *
     * @param request TokenSecurityRequest
     * @return TokenSecurity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static TokenSecurity tokenSecurity(TokenSecurityRequest request) throws ApiException {

        TokenControllerV1Api api = new TokenControllerV1Api();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperTokenSecurity tokenSecurity = api.tokenSecurityUsingGET1(
                request.getChainId(),
                request.getAddress(),
                request.getAuthorization()
        );
        return TokenSecurity.of(tokenSecurity);
    }


    /**
     * Check if the address is malicious
     *
     * @param request AddressSecurityRequest
     * @return AddressContract
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static AddressContract addressSecurity(AddressSecurityRequest request) throws ApiException {

        ApproveControllerV1Api api = new ApproveControllerV1Api();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperAddressContract addressContract = api.addressContractUsingGET1(
                request.getAddress(),
                request.getAuthorization(),
                request.getChainId()
        );
        return AddressContract.of(addressContract);

    }

    /**
     * Check if the approval is secure
     *
     * @param request ApprovalSecurityRequest
     * @return ContractApprove
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ContractApprove approvalSecurity(ApprovalSecurityRequest request) throws ApiException {
        ApproveControllerV1Api api = new ApproveControllerV1Api();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperContractApproveResponse contractApprove = api.approvalContractUsingGET(
                request.getChainId(),
                request.getAddress(),
                request.getAuthorization()
        );
        return ContractApprove.of(contractApprove);
    }


    /**
     * Check risk of all erc20 approvals under one EOA.
     *
     * @param request Erc20ApprovalSecurityRequest
     * @return ApproveTokenOutList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ApproveTokenOutList erc20ApprovalSecurity(Erc20ApprovalSecurityRequest request) throws ApiException {

        ApproveControllerV2Api api = new ApproveControllerV2Api();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperListApproveTokenOutListResponse response = api.addressTokenApproveListUsingGET1(
                request.getAddress(),
                request.getChainId(),
                request.getAuthorization()
        );
        return ApproveTokenOutList.of(response);
    }

    /**
     * Check risk of all erc721 approvals under one EOA.
     *
     * @param request Erc721ApprovalSecurityRequest
     * @return ApproveNFTList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ApproveNFTList erc721ApprovalSecurity(Erc721ApprovalSecurityRequest request) throws ApiException {
        ApproveControllerV2Api api = new ApproveControllerV2Api();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperListApproveNFTListResponse response = api.addressNFT721ApproveListUsingGET1(
                request.getAddress(),
                request.getChainId(),
                request.getAuthorization()
        );
        return ApproveNFTList.of(response);
    }


    /**
     * Check risk of all erc1155 approvals under one EOA.
     *
     * @param request Erc1155ApprovalSecurityRequest
     * @return ApproveNFT1155List
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ApproveNFT1155List erc1155ApprovalSecurity(Erc1155ApprovalSecurityRequest request) throws ApiException {
        ApproveControllerV2Api api = new ApproveControllerV2Api();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperListApproveNFT1155ListResponse response = api.addressNFT1155ApproveListUsingGET1(
                request.getAddress(),
                request.getChainId(),
                request.getAuthorization()
        );
        return ApproveNFT1155List.of(response);
    }


    /**
     * Get abi decode info
     *
     * @param request InputDecodeRequest
     * @return ParseAbiData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static ParseAbiData inputDecode(InputDecodeRequest request) throws ApiException {
        ContractAbiControllerApi api = new ContractAbiControllerApi();
        api.setApiClient(createApiClient(request.getTimeout()));
        ParseAbiDataRequest parseAbiDataRequest = new ParseAbiDataRequest();
        parseAbiDataRequest.setData(request.getBody().getData());
        parseAbiDataRequest.setChainId(request.getBody().getChainId());
        parseAbiDataRequest.setContractAddress(request.getBody().getContractAddress());
        parseAbiDataRequest.setSigner(request.getBody().getSigner());

        ResponseWrapperParseAbiDataResponse abiData = api.getAbiDataInfoUsingPOST(parseAbiDataRequest, request.getAuthorization());
        return ParseAbiData.of(abiData);
    }


    /**
     * Get NFT security and risk data.
     *
     * @param request NftSecurityRequest
     * @return NftInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static NftInfo nftSecurity(NftSecurityRequest request) throws ApiException {
        NftControllerApi api = new NftControllerApi();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperGetNftInfo nftInfo = api.getNftInfoUsingGET1(
                request.getChainId(),
                request.getAddress(),
                request.getAuthorization(),
                request.getTokenId()
        );
        return NftInfo.of(nftInfo);
    }


    /**
     * Check risk of dapp through URL
     *
     * @param request DappSecurityRequest
     * @return DappContractSecurity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static DappContractSecurity dappSecurity(DappSecurityRequest request) throws ApiException {
        DappControllerApi api = new DappControllerApi();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperDappContractSecurityResponse response = api.getDappInfoUsingGET(
                request.getAuthorization(),
                request.getUrl()
        );
        return DappContractSecurity.of(response);
    }


    /**
     * Check if the  url is a phishing site
     *
     * @param request PhishingSiteRequest
     * @return PhishingSite
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static PhishingSite phishingSite(PhishingSiteRequest request) throws ApiException {
        WebsiteControllerApi api = new WebsiteControllerApi();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperPhishingSite response = api.phishingSiteUsingGET(request.getUrl(), request.getAuthorization());
        return PhishingSite.of(response);
    }

    /**
     * Rug-pull Detection API Beta
     *
     * @param request DefiInfoRequest
     * @return DefiInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public static DefiInfo rugpullDetecting(DefiInfoRequest request) throws ApiException {
        DefiControllerApi api = new DefiControllerApi();
        api.setApiClient(createApiClient(request.getTimeout()));
        GetDefiInfoResponse defiInfoUsingGET = api.getDefiInfoUsingGET(
                request.getAddress(),
                request.getChainId(),
                request.getAuthorization()
        );
        return DefiInfo.of(defiInfoUsingGET);
    }


    public static SolanaTokenSecurity tokenSecurityForSolana(TokenSecurityForSolanaRequest request) throws ApiException {
        TokenSecurityApiForSolanaBetaApi api = new TokenSecurityApiForSolanaBetaApi();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperSolanaTokenSecurity solanaTokenSecurity = api.solanaTokenSecurityUsingGET(
                request.getContractAddresses(),
                request.getAuthorization()
        );
        return SolanaTokenSecurity.of(solanaTokenSecurity);
    }

    public static SolanaPrerunTx solanaPreExecution(SolanaPreExecutionRequest request) throws ApiException {
        TransactionSimulationForSolanaApi api = new TransactionSimulationForSolanaApi();
        api.setApiClient(createApiClient(request.getTimeout()));

        SolanaPrerunTxRequest txRequest = new SolanaPrerunTxRequest();
        txRequest.setEncodedTransaction(request.getEncodedTransaction());

        ResponseWrapperSolanaPrerunTxResponse response = api.prerunTxUsingPOST(txRequest, request.getAuthorization());
        return SolanaPrerunTx.of(response);
    }

    public static LocksTokenInfo locksTokenInfo(LocksTokenInfoRequest request) throws ApiException {
        LockControllerApi api = new LockControllerApi();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperTokenLockerResponse tokenLockersUsingGET = api.getTokenLockersUsingGET(
                request.getChainId(),
                request.getPageNum(),
                request.getPageSize(),
                request.getTokenAddress(),
                request.getAuthorization()
        );
        return LocksTokenInfo.of(tokenLockersUsingGET);
    }

    public static LocksLpv3Info locksLpv3Info(LocksInfoLpv3Request request) throws ApiException {
        LockControllerApi api = new LockControllerApi();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperNftLockerResponse nftLockersUsingGET = api.getNftLockersUsingGET(
                request.getChainId(),
                request.getPageNum(),
                request.getPageSize(),
                request.getPoolAddress(),
                request.getAuthorization()
        );
        return LocksLpv3Info.of(nftLockersUsingGET);
    }


    public static SuiTokenSecurity tokenSecurityForSui(TokenSecurityForSuiRequest request) throws ApiException {
        TokenSecurityApiForSuiApi api = new TokenSecurityApiForSuiApi();
        api.setApiClient(createApiClient(request.getTimeout()));
        ResponseWrapperSuiTokenSecurity suiTokenSecurity = api.suiTokenSecurityUsingGET(
                request.getContractAddresses(),
                request.getAuthorization()
        );
        return SuiTokenSecurity.of(suiTokenSecurity);
    }


    private static ApiClient createApiClient(Integer timeOut) {
        ApiClient apiClient = new ApiClient();
        OkHttpClient httpClient = apiClient.getHttpClient();
        OkHttpClient build = httpClient.newBuilder()
                .readTimeout(timeOut == null ? 60000 : timeOut, TimeUnit.MILLISECONDS)
                .build();
        apiClient.setHttpClient(build);
        return apiClient;
    }


}
