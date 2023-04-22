/*
 * GoPlus Security API Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ResponseWrapperListJSONObject4e98b9e2Fbdb43329976A30066e02b73;
import io.swagger.client.model.ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenControllerV1Api {
    private ApiClient apiClient;

    public TokenControllerV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public TokenControllerV1Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getChainsListUsingGET
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW1zQ9cCv8WrbB1) (optional)
     * @param name API name. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getChainsListUsingGETCall(String authorization, String name, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/supported_chains";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getChainsListUsingGETValidateBeforeCall(String authorization, String name, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getChainsListUsingGETCall(authorization, name, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the list of chains supported by different functions.
     * 
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW1zQ9cCv8WrbB1) (optional)
     * @param name API name. (optional)
     * @return ResponseWrapperListJSONObject4e98b9e2Fbdb43329976A30066e02b73
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseWrapperListJSONObject4e98b9e2Fbdb43329976A30066e02b73 getChainsListUsingGET(String authorization, String name) throws ApiException {
        ApiResponse<ResponseWrapperListJSONObject4e98b9e2Fbdb43329976A30066e02b73> resp = getChainsListUsingGETWithHttpInfo(authorization, name);
        return resp.getData();
    }

    /**
     * Get the list of chains supported by different functions.
     * 
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW1zQ9cCv8WrbB1) (optional)
     * @param name API name. (optional)
     * @return ApiResponse&lt;ResponseWrapperListJSONObject4e98b9e2Fbdb43329976A30066e02b73&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseWrapperListJSONObject4e98b9e2Fbdb43329976A30066e02b73> getChainsListUsingGETWithHttpInfo(String authorization, String name) throws ApiException {
        com.squareup.okhttp.Call call = getChainsListUsingGETValidateBeforeCall(authorization, name, null, null);
        Type localVarReturnType = new TypeToken<ResponseWrapperListJSONObject4e98b9e2Fbdb43329976A30066e02b73>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the list of chains supported by different functions. (asynchronously)
     * 
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW1zQ9cCv8WrbB1) (optional)
     * @param name API name. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChainsListUsingGETAsync(String authorization, String name, final ApiCallback<ResponseWrapperListJSONObject4e98b9e2Fbdb43329976A30066e02b73> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getChainsListUsingGETValidateBeforeCall(authorization, name, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseWrapperListJSONObject4e98b9e2Fbdb43329976A30066e02b73>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tokenSecurityUsingGET1
     * @param chainId The chain_id of the blockchain. \&quot;1\&quot; means Ethereum;  \&quot;10\&quot; means Optimism; “25” means Cronos; \&quot;56\&quot; means BSC;  “66” means OKC; \&quot;100\&quot; means Gnosis; \&quot;128\&quot; means HECO;  \&quot;137\&quot; means Polygon;  \&quot;250\&quot; means Fantom; \&quot;321\&quot; means KCC; \&quot;324\&quot; means zkSync Era; \&quot;10001\&quot; means ETHW; \&quot;201022\&quot; means FON; \&quot;42161\&quot; means Arbitrum;  \&quot;43114\&quot; means Avalanche; \&quot;59140\&quot; means Linea; \&quot;1666600000\&quot; means Harmony; \&quot;tron\&quot; means Tron. (required)
     * @param contractAddresses The contract address of tokens. (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW1zQ9cCv8WrbB1) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tokenSecurityUsingGET1Call(String chainId, String contractAddresses, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/token_security/{chain_id}"
            .replaceAll("\\{" + "chain_id" + "\\}", apiClient.escapeString(chainId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (contractAddresses != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("contract_addresses", contractAddresses));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tokenSecurityUsingGET1ValidateBeforeCall(String chainId, String contractAddresses, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'chainId' is set
        if (chainId == null) {
            throw new ApiException("Missing the required parameter 'chainId' when calling tokenSecurityUsingGET1(Async)");
        }
        // verify the required parameter 'contractAddresses' is set
        if (contractAddresses == null) {
            throw new ApiException("Missing the required parameter 'contractAddresses' when calling tokenSecurityUsingGET1(Async)");
        }
        
        com.squareup.okhttp.Call call = tokenSecurityUsingGET1Call(chainId, contractAddresses, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get token&#x27;s security and risk data.
     * 
     * @param chainId The chain_id of the blockchain. \&quot;1\&quot; means Ethereum;  \&quot;10\&quot; means Optimism; “25” means Cronos; \&quot;56\&quot; means BSC;  “66” means OKC; \&quot;100\&quot; means Gnosis; \&quot;128\&quot; means HECO;  \&quot;137\&quot; means Polygon;  \&quot;250\&quot; means Fantom; \&quot;321\&quot; means KCC; \&quot;324\&quot; means zkSync Era; \&quot;10001\&quot; means ETHW; \&quot;201022\&quot; means FON; \&quot;42161\&quot; means Arbitrum;  \&quot;43114\&quot; means Avalanche; \&quot;59140\&quot; means Linea; \&quot;1666600000\&quot; means Harmony; \&quot;tron\&quot; means Tron. (required)
     * @param contractAddresses The contract address of tokens. (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW1zQ9cCv8WrbB1) (optional)
     * @return ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849 tokenSecurityUsingGET1(String chainId, String contractAddresses, String authorization) throws ApiException {
        ApiResponse<ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849> resp = tokenSecurityUsingGET1WithHttpInfo(chainId, contractAddresses, authorization);
        return resp.getData();
    }

    /**
     * Get token&#x27;s security and risk data.
     * 
     * @param chainId The chain_id of the blockchain. \&quot;1\&quot; means Ethereum;  \&quot;10\&quot; means Optimism; “25” means Cronos; \&quot;56\&quot; means BSC;  “66” means OKC; \&quot;100\&quot; means Gnosis; \&quot;128\&quot; means HECO;  \&quot;137\&quot; means Polygon;  \&quot;250\&quot; means Fantom; \&quot;321\&quot; means KCC; \&quot;324\&quot; means zkSync Era; \&quot;10001\&quot; means ETHW; \&quot;201022\&quot; means FON; \&quot;42161\&quot; means Arbitrum;  \&quot;43114\&quot; means Avalanche; \&quot;59140\&quot; means Linea; \&quot;1666600000\&quot; means Harmony; \&quot;tron\&quot; means Tron. (required)
     * @param contractAddresses The contract address of tokens. (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW1zQ9cCv8WrbB1) (optional)
     * @return ApiResponse&lt;ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849> tokenSecurityUsingGET1WithHttpInfo(String chainId, String contractAddresses, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = tokenSecurityUsingGET1ValidateBeforeCall(chainId, contractAddresses, authorization, null, null);
        Type localVarReturnType = new TypeToken<ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get token&#x27;s security and risk data. (asynchronously)
     * 
     * @param chainId The chain_id of the blockchain. \&quot;1\&quot; means Ethereum;  \&quot;10\&quot; means Optimism; “25” means Cronos; \&quot;56\&quot; means BSC;  “66” means OKC; \&quot;100\&quot; means Gnosis; \&quot;128\&quot; means HECO;  \&quot;137\&quot; means Polygon;  \&quot;250\&quot; means Fantom; \&quot;321\&quot; means KCC; \&quot;324\&quot; means zkSync Era; \&quot;10001\&quot; means ETHW; \&quot;201022\&quot; means FON; \&quot;42161\&quot; means Arbitrum;  \&quot;43114\&quot; means Avalanche; \&quot;59140\&quot; means Linea; \&quot;1666600000\&quot; means Harmony; \&quot;tron\&quot; means Tron. (required)
     * @param contractAddresses The contract address of tokens. (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW1zQ9cCv8WrbB1) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tokenSecurityUsingGET1Async(String chainId, String contractAddresses, String authorization, final ApiCallback<ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = tokenSecurityUsingGET1ValidateBeforeCall(chainId, contractAddresses, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
